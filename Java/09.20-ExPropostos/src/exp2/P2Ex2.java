package exp2;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva

import javax.swing.JOptionPane;

public class P2Ex2 {

	public static void x() {
		
		int vetor[] = new int[1000];
		int maior=0, menor=1000;
		String numeros="";
		
		for(int i=0;i<1000;i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o " + (i+1) + "� numero (entre 0 e 999)"
					+ "\nOberva��o: Insira 0 para parar de inserir."));
			
			numeros += vetor[i] + "\n";
			
			if(vetor[i]==0) {
				i = 1000;
			}else if (vetor[i]>maior) {
				maior = vetor[i];
			}else if(vetor[i]<menor) {
				menor = vetor[i];
			}

		}
		
		
		JOptionPane.showMessageDialog(null, "Menor n�mero: \n" + menor
				+ "\nMaior \n " + maior
				+ "\nN�meros inseridos: \n" + numeros);
		
	}
}
