/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.controler;

import br.com.fatec.bean.PessoaFisica;
import br.com.fatec.db.PessoaDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class PessoaControler {
    
    public List<PessoaFisica> listarTodosPessoa() throws SQLException, ClassNotFoundException {
        List<PessoaFisica>  pess ;
        PessoaDao pesDao = new PessoaDao();
        pess = pesDao.listaTodos();
        return pess;
    }
    
    public PessoaFisica buscarPessoa(PessoaFisica pes) throws SQLException, ClassNotFoundException {
        PessoaDao pesDao = new PessoaDao();
        pes = pesDao.busca(pes);
        return pes;
    }
}
