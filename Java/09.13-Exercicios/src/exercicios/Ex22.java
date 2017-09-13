package exercicios;

import javax.swing.JOptionPane;

public class Ex22 {
	
	public static void x() {
		int i=0;
		int max = Integer.parseInt(JOptionPane.showInputDialog(null,"quantos produtos deseja usar: \nRecomendado: 40"));
		
		for (i=0;i<max;i++) {
		Double custo = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o preço de custo:"));
		Double venda = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o preço de venda:"));
		
		if(custo > venda){
			JOptionPane.showMessageDialog(null,"Prejuizo!");
			
		}else if(venda > custo) {
			JOptionPane.showMessageDialog(null,"Lucro!");
			
		}else{

			JOptionPane.showMessageDialog(null,"Empate!");
		}
		
		}
		
		String op = JOptionPane.showInputDialog(null,"Deseja inserir mais produtos?:\ns ou n (minusculo)");
	
		if(op.equals("s")) {
			x();
		}
		
		
	}
}
