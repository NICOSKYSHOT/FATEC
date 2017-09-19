package br.com.redelem.controler;

import br.com.redelem.bean.Acontecimento;
import br.com.redelem.db.AcontecimentoDao;
import java.sql.SQLException;
import java.util.List;

public class AcontecimentoControler {
    
    /*public Acontecimento validaAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.validaLogin(aco);
        return aco;
    }*/
    
    public Acontecimento inserirAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.inseri(aco);
        return aco;
    }

    public Acontecimento excluirAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.exclui(aco);
        return aco;
    }
   
    public Acontecimento buscarAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.busca(aco);
        return aco;
    }
    
    public Acontecimento alterarAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.altera(aco);
        return aco;
    }
    
    public List<Acontecimento> listarAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        List<Acontecimento>  acos ;
        AcontecimentoDao acoDao = new AcontecimentoDao();
        acos = acoDao.lista(aco);
        return acos;
    }
}
