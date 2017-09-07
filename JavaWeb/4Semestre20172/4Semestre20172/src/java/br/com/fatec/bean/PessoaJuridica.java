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
public class PessoaJuridica extends Pessoa{
    
    String cnpj;
    
    public PessoaJuridica () {
        
        this.nome = "Abrasil Informática";
        this.cnpj = "08.321.182.001-04";
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    

}
