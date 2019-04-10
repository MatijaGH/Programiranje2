
public class PoudarjanjeZnakov {

	public static void main(String[] args) {
		System.out.print(poudari("Zadnja novica"));
		System.out.print(delnoPoudari("Zadnja*novica*"));

	}
	public static String poudari(String niz) {
		String s = "";
		for (int i = 0; i < niz.length(); ++i) {
			char znak = niz.charAt(i);
			if (i != 0) s += ' ';
			s += Character.toUpperCase(znak); 
		}
		return s;
	}
	
	public static String delnoPoudari(String niz) {
		String s = "";
		boolean b = false;
	
			for (int i = 0; i < niz.length(); ++i) {
				char znak = niz.charAt(i);
				if (znak == '*') b = !b; 
				else if (b) s += Character.toUpperCase(znak);
				else s += znak;
			}
			return s;
		
	}

}
