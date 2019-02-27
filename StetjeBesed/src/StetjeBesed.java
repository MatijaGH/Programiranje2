import java.io.*;


public class StetjeBesed {

	public static void main(String[] args) throws IOException {
		int n = stetjeBesed("src/StetjeBesed.java", "StetjeBesed.txt");
		System.out.println("Na datoteki je " + n + " besed.");

	}
	
	public static int stetjeBesed(String imeVhod, String imeIzhod) throws IOException {
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhod));
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhod));
		
		int stevec = 0;
		while (vhod.ready()) {
			String vrstica = vhod.readLine().trim();
			if (vrstica.equals("")) continue;
			String[] besede = vrstica.split("\\W+"); //poljubno število presledkov " +"
			stevec += besede.length;				//Z \\W povemo, da nas zanimajo le besede z regularnimi znaki
			for (String beseda : besede) izhod.println(beseda);
		}
		
		vhod.close();
		izhod.close();
		return stevec;
	}
	
}
