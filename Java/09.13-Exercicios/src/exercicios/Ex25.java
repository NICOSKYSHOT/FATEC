package exercicios;

import javax.swing.JOptionPane;

public class Ex25 {

	public static void x() {
		
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro numero"));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo numero"));
			
			if(n1==n2) {
				JOptionPane.showMessageDialog(null, n1 + " e " + n2 + " são iguais");
			}else if(n1>n1) {
				JOptionPane.showMessageDialog(null,  n1 + " é maior que " + n2);
			}else{
				JOptionPane.showMessageDialog(null,  n1 + " é menor que " + n2); 
			}
		
		
		String op = JOptionPane.showInputDialog(null,"Deseja fazer o exercicio novamente?:\ns ou n (minusculo)");
		
		if(op.equals("s")) {
			x();
		}
		
	}
}
