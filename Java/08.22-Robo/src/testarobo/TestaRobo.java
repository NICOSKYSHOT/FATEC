package testarobo;
import testarobo.Robo;
import javax.swing.JOptionPane;

//Vitor Francisco Lamounier

public class TestaRobo {

	public static void main(String[] args) {
		
		Robo r1 = new Robo ("V17-L4M0","23/08/2017",5);
		
		int op=0;
		double n1=0, n2=0;
	
		while (op!=7){
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU" + 
					"\n1 - Criar Rob�" + 
					"\n2 - Opera��o Soma" + 
					"\n3 - Opera��o Subtra��o" + 
					"\n4 - Opera��o Multiplica��o" + 
					"\n5 - Opera��o Divis�o" + 
					"\n6 - Carregar Bateria" + 
					"\n7 - Sair" +
					"\n\nNome do Robo: " + r1.getNome() +
					"\nData de Fabrica��o " + r1.getDtfab(), "MENU ROBO - BATERIA = " + r1.getBateria(),1)); 
		
				if(op==1) {
					
					r1.setNome(JOptionPane.showInputDialog(null, "Insira o nome para o Robo:"));
					r1.setDtfab((JOptionPane.showInputDialog(null, "Insira a data de fabrica��o do Robo:")));
					r1.setBateria(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a bateria do Robo:")));
					
				}else if (op>1 && op<6 && r1.getBateria()>0) {

					n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor:"));
					n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor:"));
				
					if (op==2) {
						JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + r1.Soma(n1,n2));
					}else if (op==3) {
						JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + r1.Sub(n1,n2));
					}else if (op==4) {
						JOptionPane.showMessageDialog(null, n1 + " x " + n2 + " = " + r1.Multi(n1,n2));
					}else if (op==5) {
						JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + r1.Div(n1,n2));
					}else {
						JOptionPane.showMessageDialog(null, "Op��o Inv�lida", "ERRO", 0);
					}
					
					r1.setBateria(r1.getBateria()-1);
					JOptionPane.showMessageDialog(null, "Bateria Gasta -1", "Aten��o", 2);
					
				}else if(op==6) {
					JOptionPane.showMessageDialog(null, "Bateria Carregada +1", "Aten��o", 2);
					r1.setBateria(r1.getBateria()+1);
				}else if(op==7){
					System.exit(0);
				}else {
					JOptionPane.showMessageDialog(null, "Op��o Inv�lida\nVerifique a Bateria do Rob�", "ERRO", 0);
				}
		
		}
	}
}
