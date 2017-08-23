package testarobo;

import javax.swing.JOptionPane;

public class Robo {

		private String nome;
		private String dtfab;
		private int bateria;
		 
		public Robo(String nome, String dtfab, int bateria) {
	        this.nome = nome;
	        this.dtfab = dtfab;
	        this.bateria = bateria;
		}
		
		public void insercao(int op) {
			
			
			if (op==2) {
				double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:"));
				double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:"));
				Soma(valor1,valor2);
				
			}else if (op==3) {
				double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:"));
				double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:"));
				Sub(valor1,valor2);
				
			}else if (op==4) {
				double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:"));
				double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:"));
				Multi(valor1,valor2);
				
			}else if (op==5) {
				double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:"));
				double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:"));
				Div(valor1,valor2);
			}else if(op==7){
				System.exit(0);
			}else {
				JOptionPane.showMessageDialog(null, "Opção Inválida\nPrimeiramente é necessário criar um robô.", "ERRO", 0);
			}
			
			
		}
		
		 
		public String getNome() {
	       return this.nome; 
		}
		 
		public String getDtfab() {
			return this.dtfab;
		}
		 
		public int getBateria() {
			return this.bateria;
		}
		 
		public void setNome(String nome) {
	        this.nome = nome;
		}
		 
		public void setDtfab(String dtfab) {
	        this.dtfab = dtfab;
		}
		 
		public void setBateria(int bateria) {
	        this.bateria = bateria;
		}
		 
		public double Soma(double n1, double n2) {
						
	        			JOptionPane.showMessageDialog(null, "O resultado da soma é: " + (n1+n2) );
	        			return n1 + n2;
		}
		 
		public double Sub(double n1, double n2) {
			JOptionPane.showMessageDialog(null, "O resultado da subtração é: " +(n1-n2));
			return n1 - n2;
		}
		 
		public double Multi(double n1, double n2) {
			JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " +(n1*n2));
			return n1 * n2;
		}
		 
		public double Div(double n1, double n2) {
			JOptionPane.showMessageDialog(null, "O resultado da subtração é: " +(n1/n2));
			return n1 / n2;
		}
}
