/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.bean;

/**
 *
 * @author ProfAlexandre
 */
public class PessoaFisica extends Pessoa{
    
    String cpf;
    
    public PessoaFisica () {
        this.nome = "Alexandre Bittencourt Faria";
        this.cpf = "135.081.228-59";        
    } 

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
