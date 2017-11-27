package gm.crudexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

import gm.crudexample.crud.Create;
import gm.crudexample.crud.Delete;
import gm.crudexample.crud.MainDB;
import gm.crudexample.crud.Read;
import gm.crudexample.crud.Update;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNome, edtIdade, edtPeso;
    private Switch sDef;
    private Pessoa pessoaPraEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edt_nome);
        edtIdade = (EditText) findViewById(R.id.edt_idade);
        edtPeso = (EditText) findViewById(R.id.edt_peso);

        sDef = (Switch) findViewById(R.id.sCasada);

        findViewById(R.id.btnadd).setOnClickListener(this);
        findViewById(R.id.btn_carregar_pessoa).setOnClickListener(this);
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
            adicionarPessoa();
        } else if (id == R.id.btnEdt) {
            editarPessoa();
        } else if (id == R.id.btn_carregar_pessoa) {
            carregarPessoa();
        } else if (id == R.id.btnRemove) {
            removerPessoa();
        } else if (id == R.id.btnRemoveTable) {
            removerTabela();
        } else if (id == R.id.btnVerReg) {
            verPessoas();
        }
    }


    private void verPessoas() {


        ArrayList<Pessoa> pessoas = new Read().getPessoas();

        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            System.out.println("#" + i + " Nome: " + p.getNome() + ", Idade: " + p.getIdade() + " anos, Peso: " + p.getPeso() + "Kg, Possui deficiencia? " + (p.isDeficiente() ? "SIM." : "NÃO.") + " UID: " + p.getUID());
        }

        if (pessoas.size() == 0) System.out.println("# Não existem registros.");
    }

    private void removerTabela() {
        new Delete().removerTabela();
    }

    private void carregarPessoa() {

        EditText edtPosicao = (EditText) findViewById(R.id.edt_posiçao);
        int posiçao = Integer.parseInt(edtPosicao.getText().toString());
        ArrayList<Pessoa> mPessoas = new Read().getPessoas();
        if (posiçao >= mPessoas.size()) return;

        pessoaPraEditar = mPessoas.get(posiçao);
        edtNome.setText(pessoaPraEditar.getNome());
        edtIdade.setText(String.valueOf(pessoaPraEditar.getIdade()));
        edtPeso.setText(String.valueOf(pessoaPraEditar.getPeso()));
        sDef.setChecked(pessoaPraEditar.isDeficiente());

    }

    private void adicionarPessoa() {
        Pessoa p = new Pessoa(Pessoa.criarUID());
        p.setNome(edtNome.getText().toString());
        p.setIdade(Integer.parseInt(edtIdade.getText().toString()));
        p.setPeso(Double.parseDouble(edtPeso.getText().toString()));
        p.setDeficiencia(sDef.isChecked());

        if (new Update().addPessoa(p)) {
            Toast.makeText(this, "Pessoa foi inserida com sucesso!", Toast.LENGTH_SHORT).show();
            limparCampos();
        } else {
            Toast.makeText(this, "Erro ao inserir pessoa", Toast.LENGTH_SHORT).show();
        }

    }

    private void editarPessoa() {

        pessoaPraEditar.setNome(edtNome.getText().toString());
        pessoaPraEditar.setIdade(Integer.parseInt(edtIdade.getText().toString()));
        pessoaPraEditar.setDeficiencia(sDef.isChecked());
        pessoaPraEditar.setPeso(Double.parseDouble(edtPeso.getText().toString()));

        if (new Update().updatePessoa(pessoaPraEditar)) {
            Toast.makeText(this, "Pessoa foi atualizada com sucesso!", Toast.LENGTH_SHORT).show();
            limparCampos();
        } else {
            Toast.makeText(this, "Erro ao atualizar pessoa", Toast.LENGTH_SHORT).show();
        }

    }

    private void removerPessoa() {

        pessoaPraEditar.setNome(edtNome.getText().toString());
        pessoaPraEditar.setIdade(Integer.parseInt(edtIdade.getText().toString()));
        pessoaPraEditar.setDeficiencia(sDef.isChecked());
        pessoaPraEditar.setPeso(Double.parseDouble(edtPeso.getText().toString()));

        if (new Delete().removerPessoa(pessoaPraEditar)) {
            Toast.makeText(this, "Pessoa foi removida com sucesso!", Toast.LENGTH_SHORT).show();
            limparCampos();
        } else {
            Toast.makeText(this, "Erro ao remover pessoa", Toast.LENGTH_SHORT).show();
        }
    }

    private void limparCampos() {

        pessoaPraEditar = null;
        edtNome.setText("");
        edtIdade.setText("");
        edtPeso.setText("");
        sDef.setChecked(false);

    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "fechando DB...", Toast.LENGTH_SHORT).show();

        /*Lembre-se de fechar o DB quando fechar o app, e certifique-se de que o mesmo
        * não está em uso antes de chamar  MainDB.getInstancia().close();*/
        MainDB.getInstancia().close();

        super.onStop();
    }

}
