package br.com.fatec.controler;

import br.com.fatec.bean.Pessoa;
import br.com.fatec.bean.PessoaFisica;
import br.com.fatec.bean.PessoaJuridica;

public class PessoaControler {
    
    public Pessoa buscaPessoaFisica () {
        Pessoa pf = new PessoaFisica();
        return pf;
    }
    
    public Pessoa buscaPessoaJuridica () {
        Pessoa pf = new PessoaJuridica();
        return pf;
    }
}