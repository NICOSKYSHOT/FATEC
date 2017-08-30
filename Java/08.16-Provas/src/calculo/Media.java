package calculo;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {

		float t1, t2, t3, p1, p2, p3, m1, m2, mf1, mf2;

		t1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do trabalho 1","T1",-1));
		p1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota da prova 1","P1",-1));
		m1 = (float) ((t1*0.3) + (p1*0.7));
		
		t2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do trabalho 2","T2",-1));
		p2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota da prova 2","P2",-1));
		m2 = (float) ((t2*0.3) + (p1*0.7));
		
		mf1 = ((m1+m2)/2);
		
		if (mf1>7) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado! Média: " + mf1,"Média", 1);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação! Média: " + mf1, null, 2);
		
			p3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota da prova de recuperação","P3",-1));
			
			if (p1>p2) {
				m2 = (float)((t2*0.3) + (p3*0.7));
			}else {
				m1 = (float)((t1*0.3) + (p3*0.7));
			}
			
			mf2 = ((m1+m2)/2);
			
			if(mf2 > 6) {
				JOptionPane.showMessageDialog(null, "Aluno Aprovado por Recuperação! Média: " + mf2,"Média", 1);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno Irá realizar tira teima! Média: " + mf2,"Média", 2);
				
				t3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do Tira teima","T3",-1));
				
				if ((t3+mf2+p3)>11) {
					JOptionPane.showMessageDialog(null, "Aluno Aprovado pelo Tira-Teima! Nota: " + (t3+mf2+p3),"Nota FInal", 1);
					
				}else {
					JOptionPane.showMessageDialog(null, "Aluno Reprovado: " +(t3+mf2+p3),"Nota", 0);
				}
			}
		}
	}
}