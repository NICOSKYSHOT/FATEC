package exp1;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import javax.swing.JOptionPane;

public class P1Ex4 {
	public static void x() throws Exception, ParseException {
		
        String data = JOptionPane.showInputDialog(null,"Insira uma data no formato MM/DD/AAAA");
    	Calendar cal = Calendar.getInstance();
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		cal.setTime(sdf.parse(data));
		
		int mes = cal.get(Calendar.MONTH);
    	int dia = cal.get(Calendar.DAY_OF_MONTH);
    	int ano = cal.get(Calendar.YEAR);
    	
    	JOptionPane.showMessageDialog(null,"O mês escolhido foi: " + mes+1);
    	JOptionPane.showMessageDialog(null,"O dia escolhido foi: " + dia);
    	JOptionPane.showMessageDialog(null,"O ano escolhido foi: " + ano);
	}
}
