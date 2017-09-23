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
			+ "\nAproveite a promoção de laranjas do Tio Zé!");
			
		}else if (diasemana==3){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (terça)"
			+ "\nAproveite a promoção de flores da Dona Maria!");
			
		}else if (diasemana==4){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (quarta)"
			+ "\nAproveite a promoção no bar do Seu João!");
		
		}else if (diasemana==5){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (quinta)"
			+ "\nAproveite a promoção de Sapatos na loja do Sr. Antonio!");
		
		}else if (diasemana==6){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (sexta)"
			+ "\nAproveite a promoção de Morangos da Sra. Margarida!");
		
		}else if (diasemana==7){
			JOptionPane.showMessageDialog(null,"Oferta de Hoje (sabado)"
			+ "\nAproveite a promoção de jogos com o Jaime!");
		}
		
	}
}
