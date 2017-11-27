package com.example.profalexandre.gpsfatec.tela;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

import com.example.profalexandre.gpsfatec.dao.AlunoDao;
import com.example.profalexandre.gpsfatec.modelo.Aluno;


public class FormularioActivity extends AppCompatActivity {

    private FormularioHelper helper;
    //Editando o aluno selecionado
    public  static  final String ALUNO_SELECIONADO = "alunoselecionado";

    //camera
    private String localArquivoFoto;
    private static final int TIRA_FOTO = 123;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        this.helper = new FormularioHelper(this);

        //camera
        Button foto = helper.getFotoButton();
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                localArquivoFoto = getExternalFilesDir(null) + "/" + System.currentTimeMillis()+".jpg";
                Intent irParaCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                Uri localFoto = Uri.fromFile(new File(localArquivoFoto));
                irParaCamera.putExtra(MediaStore.EXTRA_OUTPUT, localFoto);
                startActivityForResult(irParaCamera, 123);
            }
        });

        Intent intent = this.getIntent();
        Aluno aluno = (Aluno) intent.getSerializableExtra("aluno");
        if (aluno != null)
        {
            helper.colocaNoFormulario(aluno);
        }


    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu)
    {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menu_formulario_ok:



                Aluno aluno = helper.pegaAlunoDoFormulario();
                AlunoDao dao = new AlunoDao(FormularioActivity.this);
                if(aluno.getId() != null)
                {
                    dao.alterar(aluno);
                }
                else
                {
                    dao.insere(aluno);
                }
                dao.close();

                finish();

                return false;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    //camera
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == TIRA_FOTO)
        {
            if (resultCode == Activity.RESULT_OK)
            {
                helper.carregaImagem(this.localArquivoFoto);
            }
            else
            {
                this.localArquivoFoto = null;
            }
        }
    }



}
