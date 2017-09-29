package layouts;

import layouts.LayoutGrid;
import layouts.LayoutFlow;

import javax.swing.JOptionPane;

//Vitor Francisco Lamounier

public class Layouts {

	public static void main(String[] args) {
		int op=0;
		op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU" + 
				"\n1 - Panel" + 
				"\n2 - Flow" + 
				"\n3 - Border" 
				)); 
	
			if(op==1) {
				LayoutGrid.Panel();
			}else if(op==2) {
				//LayoutFlow.Flow();
			}else if(op==3) {
				//LayoutBorder();
			}

	}
}
