package testarobo2;

public class Robo2 {

		private String nome;
		private String dtfab;
		private int bateria;
		 
		public Robo2(String nome, String dtfab, int bateria) {
	        this.nome = nome;
	        this.dtfab = dtfab;
	        this.bateria = bateria;
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
			return n1 + n2;
		}
		 
		public double Sub(double n1, double n2) {
			return n1 - n2;
		}
		 
		public double Multi(double n1, double n2) {
			return n1 * n2;
		}
		 
		public double Div(double n1, double n2) {
			return n1 / n2;
		}
}
