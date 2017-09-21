package exp2;

import javax.swing.JOptionPane;

public class P2Ex1 {

public static void x() {
		
	double vetor[] = new double[10];
	double media=0;
	String numeros="| ", maiores="| ";
	
	for(int i=0;i<10;i++) {
		vetor[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o " + (i+1) + "º numero"));
		numeros += vetor[i] + " | ";
		media += vetor[i];
	}
	
	media = media/10;

	for(int i=0;i<10;i++) {
		if (vetor[i]>media) {
			maiores += vetor[i] + " | ";
		}
	}
	
	JOptionPane.showMessageDialog(null, "Números inseridos: \n" + numeros 
			+ "\nMédia: \n| " + media + " | "
			+ "\nNúmeros acima da média: \n" + maiores);
	
}
}