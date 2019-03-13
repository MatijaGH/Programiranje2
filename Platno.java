import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial") //da ne teži zaradi serijske številke(pri veèjih projektih to je smiselno)
public class Platno extends JPanel {
	int sirina, visina;
	Graf graf;
	
	Color barvaPovezave;
	Color barvaTocke;
	Color barvaRoba;
	Color barvaOzadja;
	double polmer;
	float debelinaPovezave;
	float debelinaRoba;
	
	public Platno(int sirina, int visina) {
		this.sirina = sirina;
		this.visina = visina;
		graf = null;
		barvaPovezave = Color.BLUE; //konstante vedno z velikimi èrkami
		barvaTocke = Color.RED;
		barvaRoba = Color.BLACK;
		barvaOzadja = Color.WHITE;
		polmer = 20;
		debelinaPovezave = 2.5f;
		debelinaRoba = 1;
	}
	
	public void narisi(Graf g) {
		graf = g;
		repaint();
	}
	
	@Override //ko spreminjamo metodo iz nadrazreda
	public Dimension getPreferredSize() {
		return new Dimension(sirina, visina);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(barvaOzadja);
		Graphics2D g2 = (Graphics2D)g;
		if (graf == null) return;
		

		for (Tocka v : graf.tocke.values()) {
			for (Tocka u : v.sosedi) {
				if (v.ime.compareTo(u.ime) > 0) { //dobimo številko in pogledamo ali nekaj velja zanjo
					g.setColor(barvaPovezave);
					g2.setStroke(new BasicStroke(debelinaPovezave));
					g.drawLine(round(v.x), round(v.y), round(u.x), round(u.y));
				}
			}
		}
		g2.setStroke(new BasicStroke(debelinaRoba));
		for (Tocka v : graf.tocke.values()) {
			g.setColor(barvaTocke);
			g.fillOval(round(v.x - polmer), round(v.y - polmer), round(2 * polmer), round(2 * polmer));
			g.setColor(barvaRoba);
			g.drawOval(round(v.x - polmer), round(v.y - polmer), round(2 * polmer), round(2 * polmer));
		}
	}
	
	private static int round(double x) {
		return (int)(x +0.5); //da pravilno zaokrožuje tudi na gor(fora)
	}

}
