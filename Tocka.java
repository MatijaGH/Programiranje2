import java.util.*;

public class Tocka {

	String ime;
	Set<Tocka> sosedi;
		
	public Tocka(String ime) {
		this.ime = ime; //isto kot self v pythonu
		sosedi = new HashSet<Tocka>(); //implementacija mno�ice s pomo�jo zgo��enih tabel
		//v Javi velja, da this spu��amo, �e ga ne rabimo
	}
	
	public int stopnja() {
		return sosedi.size();
	}
	//kli�emo s t.stopnja()
		
	public String toString() {
		return ime;
	}
}
