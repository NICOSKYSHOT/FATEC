package exercicios;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		
		int op=-1;
		while (op!=0){
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "ESCOLHA O EXERCICIO" + 
					"\n21 - Serviço militar" + 
					"\n22 - Lucro ou prejuizo" + 
					"\n23" + 
					"\n24" + 
					"\n25" + 
					"\n69" + 
					"\n0 - Sair")); 
		
			switch (op) {
	
				case 0:
					System.exit(0);
					break;
					
				case 21:
					Ex21.x();
					break;
					
				case 22:
					Ex22.x();
					break;
					
				case 23:
					Ex23.x();
					break;
				case 24:
					Ex24.x();
					break;
					
				case 25:
					Ex25.x();
					break;
					
				case 69:
					Ex69.x();
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		
		}
	}

}
