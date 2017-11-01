/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.telas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import br.com.fatec.R;
import br.com.fatec.dbs.ControllerUsuario;
import br.com.fatec.modelos.UsuarioBean;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class ListUsuActivity extends Activity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
    
    ListView ListaDeAlunos;
    List<UsuarioBean> usuarios;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listusu);
        final ControllerUsuario ge = new ControllerUsuario(getBaseContext());
        ListaDeAlunos = (ListView) findViewById(R.id.listausu); 
        usuarios = ge.listarUsuarios();
        ArrayAdapter<UsuarioBean> adapter = new ArrayAdapter<UsuarioBean>(this,android.R.layout.simple_list_item_1,usuarios);
        ListaDeAlunos.setAdapter(adapter);
        ListaDeAlunos.setOnItemClickListener(this); // Clique no item
        ListaDeAlunos.setOnItemLongClickListener(this); // Pressão sobre o item
    }
    
    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        // Código para trabalhar com o item que foi pressionado
        // position é a posição do item no adapter
        UsuarioBean usu = (UsuarioBean) parent.getItemAtPosition(position);
        Intent it = new Intent(ListUsuActivity.this, UptUsuActivity.class);
        it.putExtra("Usuario",usu);
        startActivity(it);
        Toast.makeText(getApplicationContext(),"Item Pressionado :-" + position + " ID= " + usu.getId(),Toast.LENGTH_LONG).show(); 
        return true;
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Código para trabalhar com o item que foi clicado
        // position é a posição do item no adapter
        UsuarioBean usu = (UsuarioBean) parent.getItemAtPosition(position);
        Intent it = new Intent(ListUsuActivity.this, UptUsuActivity.class);
        it.putExtra("Usuario",usu);
        startActivity(it);
        Toast.makeText(getApplicationContext(),"Item Click :-" + position + " ID= " + usu.getId(),Toast.LENGTH_LONG).show(); 
    }
}
