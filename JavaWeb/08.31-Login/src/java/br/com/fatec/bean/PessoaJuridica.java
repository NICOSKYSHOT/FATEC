package br.com.fatec.bean;

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