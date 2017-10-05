package br.com.redelem.controler;

//Importações referentes a Acontecimentos
import br.com.redelem.bean.Acontecimento;
import br.com.redelem.db.AcontecimentoDao;
import java.sql.SQLException;
import java.util.List;

//Funcionalidades do Acontecimento
public class AcontecimentoControler {
    
    //Cadastro
    public Acontecimento inserirAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.inseri(aco);
        return aco;
    }
    
    //Consulta
    public List<Acontecimento> listarAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        List<Acontecimento>  acos ;
        AcontecimentoDao acoDao = new AcontecimentoDao();
        acos = acoDao.lista(aco);
        return acos;
    }
     
    //Especifica a Consulta
    public Acontecimento buscarAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.busca(aco);
        return aco;
    }
    
    //Remove
    public Acontecimento excluirAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.exclui(aco);
        return aco;
    }
   
    //Altera
    public Acontecimento alterarAcontecimento(Acontecimento aco) throws SQLException, ClassNotFoundException {
        AcontecimentoDao acoDao = new AcontecimentoDao();
        aco = acoDao.altera(aco);
        return aco;
    }
    
    //Consulta com relacionamentos
    public List<Acontecimento> listarTodosAcontecimento() throws SQLException, ClassNotFoundException {
        List<Acontecimento>  acos ;
        AcontecimentoDao acoDao = new AcontecimentoDao();
        acos = acoDao.listaTodos();
        return acos;
    }
}