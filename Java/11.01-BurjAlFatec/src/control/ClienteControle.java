package control;

import bean.Cliente;
import dao.ClienteDao;
import java.sql.SQLException;

public class ClienteControle {

    public Cliente inserirCliente(Cliente cli) throws SQLException, ClassNotFoundException {
        ClienteDao cliDao = new ClienteDao();
        cli = cliDao.inseri(cli);
        return cli;
    }
     
    public Cliente buscarCliente(Cliente cli) throws SQLException, ClassNotFoundException {
        ClienteDao cliDao = new ClienteDao();
        cli = cliDao.busca(cli);
        return cli;
    }
    
    public Cliente alterarCliente(Cliente cli) throws SQLException, ClassNotFoundException {
        ClienteDao cliDao = new ClienteDao();
        cli = cliDao.altera(cli);
        return cli;
    }
    
    public Cliente excluirCliente(Cliente cli) throws SQLException, ClassNotFoundException {
        ClienteDao cliDao = new ClienteDao();
        cli = cliDao.exclui(cli);
        return cli;
    }
    
}