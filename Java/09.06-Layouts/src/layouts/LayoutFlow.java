package layouts;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class LayoutFlow extends JFrame{
	
	public  void Flow(String nome) {
		//super(nome);
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		JButton b1 = new JButton("Sair");
		JButton b2 = new JButton("Figura");
		add(b1);add(b2);
		setSize(200,100);
		setVisible(true);
		
	}
	

}
