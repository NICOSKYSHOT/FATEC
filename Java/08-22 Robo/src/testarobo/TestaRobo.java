package testarobo;
import testarobo.Robo;
import javax.swing.JOptionPane;

public class TestaRobo {

	public static void main(String[] args) {
		
		Robo r1 = new Robo ("V17-L4M0","23/08/2017",5);
		
		int op=0;
		double n1=0, n2=0;
	
		while (op!=7){
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU" + 
					"\n1 - Criar Robô" + 
					"\n2 - Operação Soma" + 
					"\n3 - Operação Subtração" + 
					"\n4 - Operação Multiplicação" + 
					"\n5 - Operação Divisão" + 
					"\n6 - Carregar Bateria" + 
					"\n7 - Sair" +
					"\n\nNome do Robo: " + r1.getNome() +
					"\nData de Fabricação " + r1.getDtfab(), "MENU ROBO - BATERIA = " + r1.getBateria(),1)); 
			
			r1.insercao(op);
			
		}
		
	}

}
