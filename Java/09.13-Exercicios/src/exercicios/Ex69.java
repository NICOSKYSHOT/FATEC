package exercicios;

import javax.swing.JOptionPane;

public class Ex69 {

	public static void x() {
		
		int e, i, n, t=0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		e = 1;
		
		for (i =1; i<=n;i++) {
			e = e*i;
			t = t+e;
			JOptionPane.showMessageDialog(null, "Fatorial: " + i + "\nResultado: "+ e);
		}
		
		JOptionPane.showMessageDialog(null, "Total Fatorial: " + t);
	}
}
