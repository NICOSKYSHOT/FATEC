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
					op = Integer.parseInt(JOptionPane.showInputDialog(null, "ESCOLHA QUAL LISTA DE EXERC�CIOS PROPOSTOS" + 
							"\n1 - Exerc�cios Propostos 1" + 
							"\n2 - Exerc�cios propostos 2" + 
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
							JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
					}
				
			}

	}

}
