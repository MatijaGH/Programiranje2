import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Predor {

	public static void main(String[] args){
		int n = predor("\\\\Spin\\GubanecM16$\\_System\\Desktop\\Fp\podatki.txt","Predor.txt");
		System.out.println(n + " voznikov je vozilo prehitro.");

	}
	public static int predor(String imeVhod, String imeIzhod) throws IOException {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.00", symbols);
		df.setRoundingMode(RoundingMode.HALF_UP);
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhod));
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhod));
		
		int stevec = 0;
		while (vhod.ready()) {
			String vrstica = vhod.readLine().trim();
			if (vrstica.equals("")) continue;
			String[] besede = vrstica.split(" +");
			String s = besede[0];
			String t = besede[1];
			Integer.parseInt(s);
			Integer.parseInt(t);
			String r = besede[2];
			int hitrost = 622 / 2;
			if (hitrost > 80) {
				stevec += 1;
				izhod.println(r + df.format(hitrost));
			}
			
		}
		
		vhod.close();
		izhod.close();
		return stevec;
	}

}
