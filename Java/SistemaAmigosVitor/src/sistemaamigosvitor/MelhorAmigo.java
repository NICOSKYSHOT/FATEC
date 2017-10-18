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
public class MelhorAmigo extends Colega{
    private String enderececo;
    private String aniversario;
    
    @Override
    public void avisar(){
        System.out.println("aviso dado, classe melhor amigo");
    }

    public String getEnderececo() {
        return enderececo;
    }

    public void setEnderececo(String enderececo) {
        this.enderececo = enderececo;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
    
    
}
