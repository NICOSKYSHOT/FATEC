package vitflamo.vitorlamounier.view;

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

import vitflamo.vitorlamounier.R;
import vitflamo.vitorlamounier.bd.MemoriaDao;
import vitflamo.vitorlamounier.bean.Memoria;

import java.io.Serializable;
import java.util.List;

public class ListaMemoriasActivity extends AppCompatActivity {
    private ListView listaMemorias;
    private List<Memoria> memorias;
    private static final int TELEFONE_CODE_REQUEST = 10;
    private  Memoria memoriaSelecionado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        listaMemorias= (ListView) findViewById(R.id.lista_alunos);

        Button botaoAdiciona = (Button) findViewById(R.id.lista_alunos_floating_button);

        botaoAdiciona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast
                Toast.makeText(ListaMemoriasActivity.this, "Floating button clicado", Toast.LENGTH_LONG).show();

                //chamar entao o formularioActivity
                Intent intent = new Intent(ListaMemoriasActivity.this, FormularioActivity.class);
                startActivity(intent);

            }
        });

        //Editando o aluno selecionado
        //Novo setOnItemClickListener
        listaMemorias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent edicao = new Intent(ListaMemoriasActivity.this, FormularioActivity.class);
                edicao.putExtra("memoria", (Serializable) listaMemorias.getItemAtPosition(position));
                startActivity(edicao);
            }
        });

        registerForContextMenu(listaMemorias);

    }

    @Override
    protected void onResume() {
        super.onResume();
        this.carregaLista();
    }

    private void carregaLista() {

        MemoriaDao dao = new MemoriaDao(this);
        List<Memoria> alunos = dao.getLista();
        dao.close();
        ArrayAdapter<Memoria> adapter = new ArrayAdapter<Memoria>(this, android.R.layout.simple_list_item_1, memorias);
        this.listaMemorias.setAdapter(adapter);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, view, menuInfo);

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        memoriaSelecionado = (Memoria) listaMemorias.getAdapter().getItem(info.position);

        //Ligar
        MenuItem ligar = menu.add("Ligar");

        ligar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                                             @Override
                                             public boolean onMenuItemClick(MenuItem item) {
                     String permissaoLigacao = android.Manifest.permission.CALL_PHONE;
                     if (ActivityCompat.checkSelfPermission(ListaMemoriasActivity.this, permissaoLigacao) == PackageManager.PERMISSION_GRANTED) {
                         fazerLigacao();
                     } else {
                         ActivityCompat.requestPermissions(ListaMemoriasActivity.this, new String[]{permissaoLigacao}, TELEFONE_CODE_REQUEST);
                     }
                     return false;
                 }
             }
        );

        //Enviar SMS

        MenuItem sms = menu.add("Enviar SMS");
        Intent intentSms = new Intent(Intent.ACTION_VIEW);
        intentSms.setData(Uri.parse("sms:" +memoriaSelecionado.getData()));
        intentSms.putExtra("sms_body", "Mensagem");
        sms.setIntent(intentSms);

        MenuItem deletar = menu.add("Deletar");
        deletar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

            //Metodo para deletar
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                //para deletar ca xta a acaoa do metodo
                MemoriaDao dao = new MemoriaDao(ListaMemoriasActivity.this);
                dao.deletar(memoriaSelecionado);
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
        intentLigar.setData(Uri.parse("tel:" + memoriaSelecionado.getData())); //CUIDADO O NOME DENTRO DE "" DEVE XTAR EM MINIUSCULA tel
        startActivity(intentLigar);
        //Este erro de startActivity nao tem problema

    }

}