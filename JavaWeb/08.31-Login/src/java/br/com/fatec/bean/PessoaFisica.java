package br.com.fatec.bean;

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