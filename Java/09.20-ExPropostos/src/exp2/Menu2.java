package exp2;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva

import java.text.ParseException;

import javax.swing.JOptionPane;

import exp1.P1Ex1;
import exp1.P1Ex2;
import exp1.P1Ex3;
import exp1.P1Ex4;
import exp1.P1Ex5;
import menu.MenuGeral;

public class Menu2 {
	public static void x() throws ParseException, Exception {
		
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
				P2Ex1.x();
				break;

			case 2:
				P2Ex2.x();
				break;
							
			case 3:
				P2Ex3.x();
				break;
				
			case 4:
				P2Ex4.x();
				break;
				
			case 5:
				P2Ex5.x();
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
