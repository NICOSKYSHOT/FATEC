/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.controler;

import br.com.fatec.bean.Pessoa;
import br.com.fatec.bean.PessoaFisica;
import br.com.fatec.bean.PessoaJuridica;

/**
 *
 * @author ProfAlexandre
 */
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
