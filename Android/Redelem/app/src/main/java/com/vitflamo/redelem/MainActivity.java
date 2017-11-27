package com.vitflamo.redelem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

import com.vitflamo.redelem.crud.Create;
import com.vitflamo.redelem.crud.Delete;
import com.vitflamo.redelem.crud.MainDB;
import com.vitflamo.redelem.crud.Read;
import com.vitflamo.redelem.crud.Update;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtTitulo, edtData, edtInfo;
    private Switch sFav;
    private Memoria memoriaPraEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTitulo = (EditText) findViewById(R.id.edt_titulo);
        edtData = (EditText) findViewById(R.id.edt_data);
        edtInfo = (EditText) findViewById(R.id.edt_info);

        sFav = (Switch) findViewById(R.id.sFavorito);

        findViewById(R.id.btnadd).setOnClickListener(this);
        findViewById(R.id.btn_carregar_memoria).setOnClickListener(this);
        findViewById(R.id.btnEdt).setOnClickListener(this);
        findViewById(R.id.btnRemove).setOnClickListener(this);
        findViewById(R.id.btnRemoveTable).setOnClickListener(this);
        findViewById(R.id.btnVerReg).setOnClickListener(this);

        new Create().createTable();

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.btnadd) {
            adicionarMemoria();
        } else if (id == R.id.btnEdt) {
            editarMemoria();
        } else if (id == R.id.btn_carregar_memoria) {
            carregarMemoria();
        } else if (id == R.id.btnRemove) {
            removerMemoria();
        } else if (id == R.id.btnRemoveTable) {
            removerTabela();
        } else if (id == R.id.btnVerReg) {
            verMemorias();
        }
    }


    private void verMemorias() {

        ArrayList<Memoria> memorias = new Read().getMemorias();

        for (int i = 0; i < memorias.size(); i++) {
            Memoria m = memorias.get(i);
            System.out.println("#" + i + " Titulo: " + m.getTitulo() + ", Data: " + m.getData() + ", Info: " + m.getInfo() + ", Favorito? " + (m.isFavorito() ? "SIM." : "NÃO.") + " ID: " + m.getID());
        }

        if (memorias.size() == 0) System.out.println("# Não existem registros.");
    }

    private void removerTabela() {
        new Delete().removerTabela();
    }

    private void carregarMemoria() {

        EditText edtPosicao = (EditText) findViewById(R.id.edt_posicao);
        int posiçao = Integer.parseInt(edtPosicao.getText().toString());
        ArrayList<Memoria> mMemorias = new Read().getMemorias();
        if (posiçao >= mMemorias.size()) return;

        memoriaPraEditar = mMemorias.get(posiçao);
        edtTitulo.setText(memoriaPraEditar.getTitulo());
        edtData.setText(String.valueOf(memoriaPraEditar.getData()));
        edtInfo.setText(String.valueOf(memoriaPraEditar.getInfo()));
        sFav.setChecked(memoriaPraEditar.isFavorito());

    }

    private void adicionarMemoria() {
        Memoria m = new Memoria(Memoria.criarID());
        m.setTitulo(edtTitulo.getText().toString());
        m.setData(edtData.getText().toString());
        m.setInfo(edtInfo.getText().toString());
        m.setFavorito(sFav.isChecked());

        if (new Update().addMemoria(m)) {
            Toast.makeText(this, "Memoria foi inserida com sucesso!", Toast.LENGTH_SHORT).show();
            limparCampos();
        } else {
            Toast.makeText(this, "Erro ao inserir memoria", Toast.LENGTH_SHORT).show();
        }

    }

    private void editarMemoria() {

        memoriaPraEditar.setTitulo(edtTitulo.getText().toString());
        memoriaPraEditar.setData(edtData.getText().toString());
        memoriaPraEditar.setFavorito(sFav.isChecked());
        memoriaPraEditar.setInfo(edtInfo.getText().toString());

        if (new Update().updateMemoria(memoriaPraEditar)) {
            Toast.makeText(this, "Memoria foi atualizada com sucesso!", Toast.LENGTH_SHORT).show();
            limparCampos();
        } else {
            Toast.makeText(this, "Erro ao atualizar memoria", Toast.LENGTH_SHORT).show();
        }

    }

    private void removerMemoria() {

        memoriaPraEditar.setTitulo(edtTitulo.getText().toString());
        memoriaPraEditar.setData(edtData.getText().toString());
        memoriaPraEditar.setFavorito(sFav.isChecked());
        memoriaPraEditar.setInfo(edtInfo.getText().toString());

        if (new Delete().removerMemoria(memoriaPraEditar)) {
            Toast.makeText(this, "Memoria foi removida com sucesso!", Toast.LENGTH_SHORT).show();
            limparCampos();
        } else {
            Toast.makeText(this, "Erro ao remover memoria", Toast.LENGTH_SHORT).show();
        }
    }

    private void limparCampos() {

        memoriaPraEditar = null;
        edtTitulo.setText("");
        edtData.setText("");
        edtInfo.setText("");
        sFav.setChecked(false);

    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "encerrando...", Toast.LENGTH_SHORT).show();

        /*Lembre-se de fechar o DB quando fechar o app, e certifique-se de que o mesmo
        * não está em uso antes de chamar  MainDB.getInstancia().close();*/
        MainDB.getInstancia().close();

        super.onStop();
    }

}
