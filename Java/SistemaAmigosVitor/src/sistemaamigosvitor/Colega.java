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
public class Colega extends Amigo{
    private int ra;

    
    public void avisar(){
        System.out.println("aviso dado, classe colega");
    }
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    
}
