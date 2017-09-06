package testarobo2;
import testarobo2.Robo2;
import javax.swing.JOptionPane;
import java.io.IOException;  

//Vitor Francisco Lamounier

public class TestaRobo2 {

	public static void main(String[] args) throws IOException {
		
		Robo2 r2 = new Robo2 ("V17-L4M0","23/08/2017",5);
		
		int opb=0;
		opb = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja carregar bateria salva no arquivo de texto?\nSIM = 1"
				+ "\nNÃO = Qualquer número inteiro"));
		
		if(opb==1) { 
		    r2.setBateria(r2.obterBateria());
			JOptionPane.showMessageDialog(null, "Bateria Carregada de bateria.txt", "Atenção", 2);
		}else {
			JOptionPane.showMessageDialog(null, "Utilizando bateria padrão (5)", "Atenção", 2);
		}
		
		int op=0, i=1;
		double n1=0, n2=0;
		
		String logc = "";
		
		while (op!=7){
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU" + 
					"\n1 - Criar Robô" + 
					"\n2 - Operação Soma" + 
					"\n3 - Operação Subtração" + 
					"\n4 - Operação Multiplicação" + 
					"\n5 - Operação Divisão" + 
					"\n6 - Carregar Bateria" + 
					"\n7 - Sair" +
					"\n\nNome do Robo: " + r2.getNome() +
					"\nData de Fabricação " + r2.getDtfab(), "MENU ROBO - BATERIA = " + r2.getBateria(),1)); 
		
				if(op==1) {
					
					r2.setNome(JOptionPane.showInputDialog(null, "Insira o nome para o Robo:"));
					r2.setDtfab((JOptionPane.showInputDialog(null, "Insira a data de fabricação do Robo:")));
					r2.setBateria(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a bateria do Robo:")));
					
				}else if (op>1 && op<6 && r2.getBateria()>0) {

					n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:"));
					n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:"));
				
					if (op==2) {
						JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + r2.Soma(n1,n2));
						logc = logc + " \n|" + i + ") " + n1 + " + " + n2 + " = " + r2.Soma(n1,n2);
					}else if (op==3) {
						JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + r2.Sub(n1,n2));
						logc = logc + " \n|" + i + ") "+ n1 + " - " + n2 + " = " + r2.Sub(n1,n2);
					}else if (op==4) {
						JOptionPane.showMessageDialog(null, n1 + " x " + n2 + " = " + r2.Multi(n1,n2));
						logc = logc + " \n|" + i + ") "+ n1 + " x " + n2 + " = " + r2.Multi(n1,n2);
					}else if (op==5) {
						JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + r2.Div(n1,n2));
						logc = logc + " \n|" + i + ") "+ n1 + " / " + n2 + " = " + r2.Div(n1,n2);
					}else {
						JOptionPane.showMessageDialog(null, "Opção Inválida", "ERRO", 0);
					}
					
					i++;
					r2.setBateria(r2.getBateria()-1);
					JOptionPane.showMessageDialog(null, "Bateria Gasta -1", "Atenção", 2);
					
				}else if(op==6) {
					
					JOptionPane.showMessageDialog(null, "Bateria Carregada +1", "Atenção", 2);
					r2.setBateria(r2.getBateria()+1);
				
				}else if(op==7){
				
					r2.gravarLog(logc);
					r2.gravarBateria();
					System.exit(0);
					
				}else {
					JOptionPane.showMessageDialog(null, "Opção Inválida\nVerifique a Bateria do Robô", "ERRO", 0);
				}
		
		}
	}
}
