package exp1;

import javax.swing.JOptionPane;
import menu.MenuGeral;

public class Menu1 {

	public static void x() {
		
		int op=-1;
		while (op!=0){
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "EXERC�CIOS PROPOSTOS 1" + 
					"\n1 - Promo��es" + 
					"\n2 - Dia Atual" + 
					"\n3 - Dias que uma pesoa viveu" + 
					"\n4 - Separa��o de Data" + 
					"\n5 - Data v�lida" + 
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
					JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			}
		

		}

	}
}