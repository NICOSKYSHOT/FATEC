package menu;

import exp1.Menu1;
import exp2.Menu2;

import javax.swing.JOptionPane;

public class MenuGeral {

			public static void main(String[] args) {
				
				x();
				
				}
			
			public static void x() {
				
			
				int op=-1;
				while (op!=0){
					op = Integer.parseInt(JOptionPane.showInputDialog(null, "ESCOLHA QUAL LISTA DE EXERCÍCIOS PROPOSTOS" + 
							"\n1 - Exercícios Propostos 1" + 
							"\n2 - Exercícios propostos 2" + 
							"\n3 - Sair")); 
				
					switch (op) {
			
						case 1:
							Menu1.x();
							break;

						case 2:
							Menu2.x();
							break;
							
						case 3:
							System.exit(0);
							break;
							
						default:
							JOptionPane.showMessageDialog(null, "Opção Inválida");
					}
				
			}

	}

}
