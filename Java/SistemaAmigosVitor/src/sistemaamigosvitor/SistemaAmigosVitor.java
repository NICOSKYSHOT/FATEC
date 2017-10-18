/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaamigosvitor;

/**
 *
 * @author Vitfl
 */
public class SistemaAmigosVitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MelhorAmigo a1 = new MelhorAmigo();
        Colega c1 = new Colega();
        
        c1.setNome("Igor");
        c1.setContato("igortop@hotmail.com");
        
        a1.setNome("Caio");
        a1.setRa(1234567);
        
        c1.avisar();
        a1.avisar();
        
    }
    
}
