package exercicios;

import javax.swing.JOptionPane;

public class Ex24 {

	public static void x() {
		
		int i=0;
		int max = Integer.parseInt(JOptionPane.showInputDialog(null,"quantos numeros deseja usar?"));
		
		for (i=0;i<max;i++) {
			double n = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
			
			if(n>0) {
				JOptionPane.showMessageDialog(null, n + " é positivo");
			}else if(n<0) {
				JOptionPane.showMessageDialog(null,  n + " é negativo");
			}else{
				JOptionPane.showMessageDialog(null,  n + " é igual a zero"); 
			}
			
		}
		
		String op = JOptionPane.showInputDialog(null,"Deseja inserir mais produtos?:\ns ou n (minusculo)");
		
		if(op.equals("s")) {
			x();
		}
	}
}
