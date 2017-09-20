package exp1;

import java.util.Calendar;
import javax.swing.JOptionPane;


public class Ex2 {
public static void x() {
		
		Calendar cal = Calendar.getInstance();
		int diames = cal.get(Calendar.DAY_OF_MONTH);
		
	
			JOptionPane.showMessageDialog(null,"Hoje é dia: " + diames);
	
	}
}
