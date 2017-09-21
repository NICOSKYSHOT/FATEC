package exp2;

import javax.swing.JOptionPane;

public class P2Ex3 {
	public static void x() {
		
		String[] nomes = new String[10];
		String procurado;
		
		for(int i=0;i<10;i++) {
			nomes[i] = JOptionPane.showInputDialog(null,"Insira o " + (i+1) + "º nome");
		}
		
		procurado = JOptionPane.showInputDialog(null,"Insira o nome que deseja encontrar no vetor");
		
		for(int i=0;i<10;i++) {
			if(nomes[i].equals(procurado)){
				JOptionPane.showInputDialog(null, procurado + " foi o " + (i+1) + "º nome cadastrado");
			}else {
				JOptionPane.showInputDialog(null, procurado + " não foi encontrado na " + (i+1) + "ª posição");
			}
		}
		
	}
}
