import javax.swing.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Nastavitve extends JDialog {

	public Nastavitve(JFrame okno) {
		super(okno, "Nastavitve", true); //true pove, da dokler sem v nastavitvah, ne morem delati z grafom(modalno okno)
		pack();
	}
}
