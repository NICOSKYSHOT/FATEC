package exp1;

import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Ex3 {
	public static void x() {
		
		Calendar cal = Calendar.getInstance();
		int ano, dia, mes;
		
			ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que ano você nasceu?"));
			mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que mes você nasceu?"));
			dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Em que dia você nasceu?"));
			
		
	}
}