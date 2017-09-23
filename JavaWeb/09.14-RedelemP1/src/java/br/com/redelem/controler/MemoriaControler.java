package br.com.redelem.controler;

import br.com.redelem.bean.Memoria;
import br.com.redelem.db.MemoriaDao;
import java.sql.SQLException;
import java.util.List;

public class MemoriaControler {
    
    /*
    public Memoria validaUsuario(Memoria mem) throws SQLException, ClassNotFoundException {
        MemoriaDao memDao = new UsuarioDao();
        mem = memDao.validaLogin(mem);
        return mem;
    }
    */
    public Memoria inserirMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        MemoriaDao memDao = new MemoriaDao();
        mem = memDao.inseri(mem);
        return mem;
    }

    public Memoria excluirMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        MemoriaDao memDao = new MemoriaDao();
        mem = memDao.exclui(mem);
        return mem;
    }
   
    public Memoria buscarMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        MemoriaDao memDao = new MemoriaDao();
        mem = memDao.busca(mem);
        return mem;
    }
    
    public Memoria alterarMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        MemoriaDao memDao = new MemoriaDao();
        mem = memDao.altera(mem);
        return mem;
    }
    
    public List<Memoria> listarMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        List<Memoria>  mems ;
        MemoriaDao memDao = new MemoriaDao();
        mems = memDao.lista(mem);
        return mems;
    }
}
