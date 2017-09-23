package exp1;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import javax.swing.JOptionPane;

public class P1Ex5 {
	public static void x() throws Exception, ParseException {
		
        String data = JOptionPane.showInputDialog(null,"Insira uma data no formato MM/DD/AAAA");
        
        DateFormat df = new SimpleDateFormat ("MM/dd/yyyy");
        df.setLenient (false);
        
        try {
            df.parse (data);
            JOptionPane.showMessageDialog(null, data + " é uma Data valida");
        } catch (ParseException ex) {
        	JOptionPane.showMessageDialog(null, data + " é uma Data invalida");
        }
    	
    	
	}
}
