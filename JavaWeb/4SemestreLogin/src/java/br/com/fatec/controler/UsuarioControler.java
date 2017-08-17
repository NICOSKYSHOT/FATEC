package br.com.fatec.controler;

import br.com.fatec.bean.Usuario;

public class UsuarioControler {
    public Usuario validausuario(Usuario usu){
        UsuarioDai usuDao = new UsuarioDao();
        usu = usuDao = new Usuario()
        usu.setId("1");
        usu.setStatus("ativo");
        usu.setTipo("adm");
        return usu;
    }
    
    public Usuario inserirUsuario(Usuario usu){
        usu.setId("1");
        return usu;
    }
}
