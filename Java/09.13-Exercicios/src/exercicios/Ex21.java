package exercicios;

import javax.swing.JOptionPane;

public class Ex21 {

	public static void x() {
	
		String nome = JOptionPane.showInputDialog(null,"Insira o nome: ");
		String sexo = JOptionPane.showInputDialog(null,"Insira o sexo (m ou f):\n*m e f em minusculo ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a idade: "));
		String saude = JOptionPane.showInputDialog(null,"Insira a saude (boa ou ruim): \n*boa e ruim em minusculo ");
		
		if(idade >= 18 && sexo.equals("m") && saude.equals("boa")) {
			JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSaude: " + saude
			+ "\nServi�o Militar Obrigat�rio");
			
		}else if (idade >= 18 && saude.equals("boa")){
			JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSaude: " + saude
					+ "\nServi�o Militar Opcional");
			
		}else {
			JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSaude: " + saude
					+ "\nN�o apto ao servi�o militar");
			
		}
		
		String op = JOptionPane.showInputDialog(null,"Deseja inserir mais algu�m?:\ns ou n (minusculo) ");
		
		if(op.equals("s")) {
			x();
		}
	}
}
