package exp1;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva

import java.util.GregorianCalendar;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class P1Ex3 {
	
	public static void x() {
		
		int hano, pano, hmes, pmes, hdia, pdia;
	
		hano = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que ano estamos?"));
		hmes = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que mes estamos?"));
		hdia = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que dia estamos?"));
		
		Calendar hoje = new GregorianCalendar(hano, hmes- 1, hdia);
		
		pano = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que ano você nasceu?"));
		pmes = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que mes você nasceu?"));
		pdia = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que dia você nasceu?"));
		
		Calendar pessoa = new GregorianCalendar(pano, pmes- 1, pdia);
		
		double dias = hoje.getTimeInMillis() - pessoa.getTimeInMillis();
	    dias = dias / (24 * 60 * 60 * 1000);
	    
	    JOptionPane.showInputDialog(null,"Você já viveu " + dias + " dias.");
	    
	}
}