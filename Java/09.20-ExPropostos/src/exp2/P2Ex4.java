package exp2;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva

import javax.swing.JOptionPane;

public class P2Ex4 {
	public static void x() {
		
		       double[][] n = new double[3][5];
		       double m1=0,m2=0,m3=0,mg=0,mp1=0,mp2=0,mp3=0,mpg=0;
		       String r ="";
		       
		       for(int i=0;i<3;i++){
		           for(int j=0;j<5;j++){
		            
		               n[i][j]= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do " + (j+1) + "º aluno da " + (i+1) + "ª classe" ));
		               
		           }
		       }
		       for(int i=0;i<3;i++){
		           for(int j=0;j<5;j++){
		        
		               mpg = (mpg + n[i][j]);       
		               r=(r+n[i][j] + " | ");
		               
		           }
		           r+=("\n");
		       }
		       
		       for(int j=0;j<5;j++){
		           mp1 = (mp1 + n[0][j]);
		           mp2 = (mp2 + n[1][j]);
		           mp3 = (mp3 + n[2][j]);
		       }
		       
		       m1=(mp1/5);
		       m2=(mp2/5);
		       m3=(mp3/5);
		       mg=(mpg/15);
		       
		       JOptionPane.showMessageDialog(null,r + "\n");
		       JOptionPane.showMessageDialog(null,"A média da primeira classe foi: " + m1 
		    		   + "\nA média da segunda classe foi: " + m2 + "\nA média da terceira classe foi: " 
		    		   + m3 + "\nA média da escola foi: " + mg);
		       
		
	}
}
