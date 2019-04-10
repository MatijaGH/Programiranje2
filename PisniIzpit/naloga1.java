
public class naloga1 {

	public static void main(String[] args) {
		System.out.println(stevila("00110010011101101010101011110000"));

	}
	
	public static int[] stevila(String niz) {
		int n = niz.length()/8;
		int[] tab = new int[n];
		for (int j = 0; j < n; ++j) {
			int stevilo = 0;
			int k = 7;
			for (int i=0; i<8; ++i) {
				String znak = ""+niz.charAt(i+j*8);
				stevilo += (Integer.valueOf(znak))*Math.pow(2, k);
				k -= 1;
			}
			tab[j] = stevilo;
		}
		return tab;
	}

}
