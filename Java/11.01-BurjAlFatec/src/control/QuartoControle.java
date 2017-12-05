package control;

import bean.Quarto;
import dao.QuartoDao;
import java.sql.SQLException;

public class QuartoControle {

    public Quarto inserirQuarto(Quarto qua) throws SQLException, ClassNotFoundException {
        QuartoDao quaDao = new QuartoDao();
        qua = quaDao.inseri(qua);
        return qua;
    }
     
    public Quarto buscarQuarto(Quarto qua) throws SQLException, ClassNotFoundException {
        QuartoDao quaDao = new QuartoDao();
        qua = quaDao.busca(qua);
        return qua;
    }
    
    public Quarto alterarQuarto(Quarto qua) throws SQLException, ClassNotFoundException {
        QuartoDao quaDao = new QuartoDao();
        qua = quaDao.altera(qua);
        return qua;
    }
    
    public Quarto excluirQuarto(Quarto qua) throws SQLException, ClassNotFoundException {
        QuartoDao quaDao = new QuartoDao();
        qua = quaDao.exclui(qua);
        return qua;
    }
    
}