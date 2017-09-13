package exercicios;

import javax.swing.JOptionPane;

public class Ex23 {

	public static void x() {
		
		double n = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero"));
		
		if(n>80) {
			JOptionPane.showMessageDialog(null, n + " é maior que 80");
		}else if(n<25) {
			JOptionPane.showMessageDialog(null,  n + " é menor que 25");
		}else if(n==40) {
			JOptionPane.showMessageDialog(null,  n + " é igual a 40"); 
		}else {
			JOptionPane.showMessageDialog(null,  n + " énão corresponde a nenhuma das opções");
		}
		
		String op = JOptionPane.showInputDialog(null,"Deseja inserir mais um numero?:\ns ou n (minusculo)");
		
		if(op.equals("s")) {
			x();
		}
	}
}
