package exp1;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva

import java.util.Calendar;
import javax.swing.JOptionPane;

public class P1Ex1 {
	public static void x() {
		
		Calendar cal = Calendar.getInstance();
		int diasemana = cal.get(Calendar.DAY_OF_WEEK);
		
		if(diasemana==1) {
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (domingo)"
			+ "\nCarro 0km agora com 10% de desconto!");
			
		}else if (diasemana==2){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (segunda)"
			+ "\nAproveite a promo��o de laranjas do Tio Z�!");
			
		}else if (diasemana==3){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (ter�a)"
			+ "\nAproveite a promo��o de flores da Dona Maria!");
			
		}else if (diasemana==4){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (quarta)"
			+ "\nAproveite a promo��o no bar do Seu Jo�o!");
		
		}else if (diasemana==5){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (quinta)"
			+ "\nAproveite a promo��o de Sapatos na loja do Sr. Antonio!");
		
		}else if (diasemana==6){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (sexta)"
			+ "\nAproveite a promo��o de Morangos da Sra. Margarida!");
		
		}else if (diasemana==7){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (sabado)"
			+ "\nAproveite a promo��o de jogos com o Jaime!");
		}
		
	}
}
