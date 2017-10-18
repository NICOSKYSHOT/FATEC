package br.com.redelem.controler;

//Importações, note o Usuário e Acontecimento
import br.com.redelem.bean.Acontecimento;
import br.com.redelem.bean.Usuario;
import br.com.redelem.bean.Memoria;
import br.com.redelem.db.MemoriaDao;
import java.sql.SQLException;
import java.util.List;

//Funcionalidades da Memória
public class MemoriaControler {
    
    static UsuarioControler usuCont = new UsuarioControler();
    static AcontecimentoControler acoCont = new AcontecimentoControler();
    
    public Memoria inserirMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        MemoriaDao memDao = new MemoriaDao();
        mem = memDao.inseri(mem);
        return mem;
    }
    
    public Memoria buscarMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        
        MemoriaDao memDao = new MemoriaDao();
        mem = memDao.busca(mem);

        Usuario usu = new Usuario(mem.getMuid(),"","","","","");
        usu = usuCont.buscarUsuario(usu);
        mem.setUsu(usu);

        Acontecimento aco = new Acontecimento(mem.getMacod(),"","","");
        aco = acoCont.buscarAcontecimento(aco);
        mem.setAco(aco);

        return mem;
    }

    public Memoria excluirMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        MemoriaDao memDao = new MemoriaDao();
        mem = memDao.exclui(mem);
        return mem;
    }
   
    public Memoria alterarMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        MemoriaDao memDao = new MemoriaDao();
        mem = memDao.altera(mem);
        return mem;
    }
    
    public List<Memoria> listarMemoria(Memoria mem) throws SQLException, ClassNotFoundException {
        
        MemoriaDao memDao = new MemoriaDao();
        
        List<Memoria>  mems = memDao.lista(mem);
        
        for(Memoria listaMemoria : mems){
            Usuario usu = new Usuario(listaMemoria.getMuid(),"","","","","");
            Acontecimento aco = new Acontecimento(listaMemoria.getMacod(),"","","");
            
            listaMemoria.setAco(acoCont.buscarAcontecimento(aco));
            listaMemoria.setUsu(usuCont.buscarUsuario(usu));
            
        }
        return mems;
    }
}