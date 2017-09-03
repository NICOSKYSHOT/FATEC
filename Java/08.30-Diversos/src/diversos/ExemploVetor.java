package diversos;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class ExemploVetor {

	public static void main(String[] args) {
	
		int chamada[];
		chamada = new int[5];
		String saida = "Chamada \tFaltas \n";
		JTextArea saidaArea = new JTextArea();
		
		for (int i=1;i<chamada.length;i++) {
			saida+=i+"\t"+chamada[i]+"\n";
			
			
			saidaArea.setText(saida);	

			
		}
			
		JOptionPane.showMessageDialog(null, saidaArea,"Inicializando Array",JOptionPane.INFORMATION_MESSAGE);
	
	}

}
