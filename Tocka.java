import java.util.*;

public class Tocka {

	String ime;
	Set<Tocka> sosedi;
	double x,y;
	

	public Tocka(String ime) {
		this.ime = ime; //isto kot self v pythonu
		sosedi = new HashSet<Tocka>();
		x = y = 0;
		
		//implementacija množice s pomoèjo zgošèenih tabel
		//v Javi velja, da this spušèamo, èe ga ne rabimo
	}
	
	public int stopnja() {
		return sosedi.size();
	}
	//klièemo s t.stopnja()
		
	public String toString() {
		return ime;
	}
}