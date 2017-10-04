package classes;

import javax.swing.JOptionPane;
import telas.Urna;

public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op=-1;
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "ESCOLHA O EXERCICIO" + 
                        "\n1 - Calculadora" + 
                        "\n2 - Maiores que a média" + 
                        "\n3 - Encontrar Pessoa em vetor" + 
                        "\n4 - URNA" +
                        "\n0 - Sair")); 

        switch (op) {

                case 0:
                        System.exit(0);
                        break;

                case 4:
                        Urna.main();
                        break;


                default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
                        
    
    }
}
