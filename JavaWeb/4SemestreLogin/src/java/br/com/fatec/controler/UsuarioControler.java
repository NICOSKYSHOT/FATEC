/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.controler;

import br.com.fatec.bean.Usuario;

public class UsuarioControler {
    public Usuario validausuario(Usuario usu){
        usu.setStatus("ativo");
        usu.setTipo("adm");
        return usu;
    }
}
