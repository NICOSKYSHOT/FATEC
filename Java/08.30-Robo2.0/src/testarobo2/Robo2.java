package testarobo2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;  
import java.io.FileWriter;
import java.io.IOException;  

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
		
		public void gravarLog(String logc) throws IOException{
			FileWriter log;   
		            log = new FileWriter(new File("src/arquivos/logcontas.txt"));  
		            log.write("Histórico de Operações: \n| " + logc);  
		            log.close();  
		}
		
		public void gravarBateria() throws IOException{
			FileWriter bateria = new FileWriter("src/arquivos/bateria.txt");
			bateria.write(this.getBateria());
			bateria.close();
		}
		
		public int obterBateria() throws FileNotFoundException, IOException{
			String linha="5";
			BufferedReader ler = new BufferedReader(new FileReader("src/arquivos/bateria.txt"));
			while (ler.ready()) {
				linha = ler.readLine();	
			}
			ler.close();
			return Integer.parseInt(linha);
		}
}
