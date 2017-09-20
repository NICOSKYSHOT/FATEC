package exp2;

import javax.swing.JOptionPane;

import menu.MenuGeral;

public class Menu2 {
	public static void x() {
		
		int op=-1;
		while (op!=0){
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "EXERCÍCIOS PROPOSTOS 2" + 
					"\n1 - Maior que a média" + 
					"\n2 - Menor e Maior" + 
					"\n3 - Verificar Cadastro" + 
					"\n4 - Média de Escola" + 
					"\n5 - Organizar Número" + 
					"\n6 - Voltar")); 
		
			switch (op) {
	
				case 1:
					break;

				case 2:
					
					break;
					
				case 6:
					MenuGeral.x();
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		

		}

		}
}
