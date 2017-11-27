package vitflamo.vitorlamounier.tela;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import vitflamo.vitorlamounier.dao.AlunoDao;
import vitflamo.vitorlamounier.modelo.Aluno;

import java.io.Serializable;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {
    private ListView listaAlunos;
    private List<Aluno> alunos;
    private static final int TELEFONE_CODE_REQUEST = 10;
    private  Aluno alunoSelecionado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        listaAlunos = (ListView) findViewById(R.id.lista_alunos);

        Button botaoAdiciona = (Button) findViewById(R.id.lista_alunos_floating_button);

        botaoAdiciona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast
                Toast.makeText(ListaAlunosActivity.this, "Floating button clicado", Toast.LENGTH_LONG).show();

                //chamar entao o formularioActivity
                Intent intent = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(intent);

            }
        });

        //Editando o aluno selecionado
        //Novo setOnItemClickListener
        listaAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent edicao = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                edicao.putExtra("aluno", (Serializable) listaAlunos.getItemAtPosition(position));
                startActivity(edicao);
            }
        });

        registerForContextMenu(listaAlunos);

    }

    @Override
    protected void onResume() {
        super.onResume();
        this.carregaLista();
    }

    private void carregaLista() {

        AlunoDao dao = new AlunoDao(this);
        List<Aluno> alunos = dao.getLista();
        dao.close();
        ArrayAdapter<Aluno> adapter = new ArrayAdapter<Aluno>(this, android.R.layout.simple_list_item_1, alunos);
        this.listaAlunos.setAdapter(adapter);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, view, menuInfo);

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        alunoSelecionado = (Aluno) listaAlunos.getAdapter().getItem(info.position);

        //Ligar
        MenuItem ligar = menu.add("Ligar");

        ligar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                                             @Override
                                             public boolean onMenuItemClick(MenuItem item) {
                                                 String permissaoLigacao = android.Manifest.permission.CALL_PHONE;
                                                 if (ActivityCompat.checkSelfPermission(ListaAlunosActivity.this, permissaoLigacao) == PackageManager.PERMISSION_GRANTED) {
                                                     fazerLigacao();
                                                 } else {
                                                     ActivityCompat.requestPermissions(ListaAlunosActivity.this, new String[]{permissaoLigacao}, TELEFONE_CODE_REQUEST);
                                                 }
                                                 return false;
                                             }
                                         }
        );

        //Enviar SMS

        MenuItem sms = menu.add("Enviar SMS");
        Intent intentSms = new Intent(Intent.ACTION_VIEW);
        intentSms.setData(Uri.parse("sms:" +alunoSelecionado.getTelefone()));
        intentSms.putExtra("sms_body", "Mensagem");
        sms.setIntent(intentSms);


        //site
        MenuItem site = menu.add("Navegar no site");
        Intent intentSite = new Intent(Intent.ACTION_VIEW);
        intentSite.setData(Uri.parse("http:" +alunoSelecionado.getSite()));
        site.setIntent(intentSite);

        //Mapa
        MenuItem mapa = menu.add("Achar o mapa");
        Intent intentMapa = new Intent(Intent.ACTION_VIEW);
        intentMapa.setData(Uri.parse("geo:0.0?z=14&q=" + Uri.encode(alunoSelecionado.getEndereco())));
        mapa.setIntent(intentMapa);


        MenuItem deletar = menu.add("Deletar");
        deletar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

            //Metodo para deletar
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                //para deletar ca xta a acaoa do metodo
                AlunoDao dao = new AlunoDao(ListaAlunosActivity.this);
                dao.deletar(alunoSelecionado);
                dao.close();
                carregaLista();

                return false;
            }
        });

    }

    @Override
    public void onRequestPermissionsResult ( int requestCode, @NonNull String[] permissions,
                                             @NonNull int[] grantResults)
    {
        if (requestCode == TELEFONE_CODE_REQUEST) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                fazerLigacao();
            } else {
                Toast.makeText(this, "Permissao de ligacao nao concedida", Toast.LENGTH_LONG).show();
            }
        }
    }

    private void fazerLigacao() {
        Intent intentLigar = new Intent(Intent.ACTION_CALL);
        intentLigar.setData(Uri.parse("tel:" + alunoSelecionado.getTelefone())); //CUIDADO O NOME DENTRO DE "" DEVE XTAR EM MINIUSCULA tel
        startActivity(intentLigar);
        //Este erro de startActivity nao tem problema

    }

}