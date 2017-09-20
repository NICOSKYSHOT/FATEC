package exp1;

import javax.swing.JOptionPane;
import menu.MenuGeral;

public class Menu1 {

	public static void x() {
		
		int op=-1;
		while (op!=0){
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "EXERCÍCIOS PROPOSTOS 1" + 
					"\n1 - Promoções" + 
					"\n2 - Dia Atual" + 
					"\n3 - Dias que uma pesoa viveu" + 
					"\n4 - Separação de Data" + 
					"\n5 - Data válida" + 
					"\n6 - Voltar")); 
		
			switch (op) {
	
				case 1:
					Ex1.x();
					break;

				case 2:
					Ex2.x();
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