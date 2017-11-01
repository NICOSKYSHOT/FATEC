/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.telas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.fatec.R;
import br.com.fatec.dbs.ControllerUsuario;
import br.com.fatec.modelos.UsuarioBean;

/**
 *
 * @author ProfAlexandre
 */
public class AddUsuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addusu);
        final ControllerUsuario ge = new ControllerUsuario(getBaseContext());
        Button Inserir = (Button) findViewById(R.id.btinserir);
        
        Inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText login = (EditText)findViewById(R.id.login);
                EditText senha = (EditText)findViewById((R.id.senha));
                EditText status = (EditText)findViewById(R.id.status);
                EditText tipo = (EditText)findViewById(R.id.tipo);
   
                String loginString = login.getText().toString();
                String senhaString = senha.getText().toString();
                String statusString = status.getText().toString();
                String tipoString = tipo.getText().toString();

                UsuarioBean usu = new UsuarioBean();
                usu.setId("");
                usu.setLogin(loginString);
                usu.setSenha(senhaString);
                usu.setStatus(statusString);
                usu.setTipo(tipoString);
                String msg = ge.inserir(usu);
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });
        
        
        
        
    }

}
