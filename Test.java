
public class Test {


	public static void main(String[] args) {
		Graf graf = Graf.cikel(5);
		graf.razporedi(300, 300, 200);
		graf.izpis();
		
		Okno okno = new Okno();
		okno.pack();
		okno.setVisible(true);
		okno.platno.narisi(graf); //okno vsebuje platno, ki vsebuje narisi
	}
}
