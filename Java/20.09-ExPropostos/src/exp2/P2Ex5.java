package exp2;

//Vitor Francisco Lamounier & Lucas Joaquim da Silva	

import java.util.Arrays;
import javax.swing.JOptionPane;

public class P2Ex5 {
   public static void x(){
	   
    int i;
    
	int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho de vetor")); 
    int[] num = new int[t];
 
    for(i = 0; i < t; i++){ 
    num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da posição ["+ (i+1) +"]")); 
    } // for

    Arrays.sort(num);
    
    JOptionPane.showMessageDialog(null,"Números PARES em forma crescente");
    for(i = 0; i < t; i++){
        if(num[i]% 2 == 0){          
            JOptionPane.showMessageDialog(null,num[i]);
            } 
        }
    
    JOptionPane.showMessageDialog(null,"Números ÍMPARES em forma decrescente");
    for(i = 4; i >= 0; i--){
            if(num[i]% 2 == 1){            
                JOptionPane.showMessageDialog(null,num[i]);
            } 
        }
   }
} 