/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.controler;

import br.com.fatec.bean.Usuario;
import br.com.fatec.db.UsuarioDao;
import java.sql.SQLException;

/**
 *
 * @author ProfAlexandre
 */
public class UsuarioControler {
    
    public Usuario validaUsuario(Usuario usu) throws SQLException, ClassNotFoundException {
        UsuarioDao usuDao = new UsuarioDao();
        usu = usuDao.validaLogin(usu);
        return usu;
    }
    
    public Usuario inserirUsuario(Usuario usu) {
        usu.setId(1);
        return usu;
    }

}
