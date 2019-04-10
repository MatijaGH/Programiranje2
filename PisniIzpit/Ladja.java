import java.util.*;

public class Ladja {
	
	int nosilnost;
	LinkedList<Integer> tovor;
	int stevec;
	
	public Ladja(int nosilnost) {
		this.nosilnost = nosilnost;
		tovor = new LinkedList<Integer>();
		stevec = 0;
	}
	
	public void natovori(int teza) {
		int obtezenost = 0;
		for (int i = 0; i < tovor.size(); ++i) obtezenost += tovor.get(i);
		if (obtezenost + teza > nosilnost) {
			int nova = obtezenost + teza;
			while (nova > nosilnost) {
				int odstranjen = tovor.pollFirst();
				stevec += 1;
				nova -= odstranjen;
			}
		}
	}
	public int odstranjenih() {
		return stevec;
	}
	public static void main(String[] args) {
		Ladja l = new Ladja(30);
		l.natovori(10);
		System.out.println(l.tovor);
		System.out.println(l.stevec);
		
	}
}
