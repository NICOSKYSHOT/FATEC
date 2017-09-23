package exp1;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva
import java.util.Calendar;
import javax.swing.JOptionPane;

public class P1Ex2 {
public static void x() {
		
		Calendar cal = Calendar.getInstance();
		
		int diames = cal.get(Calendar.DAY_OF_MONTH);

		JOptionPane.showMessageDialog(null,"Hoje é dia: " + diames);
		
	}
}
