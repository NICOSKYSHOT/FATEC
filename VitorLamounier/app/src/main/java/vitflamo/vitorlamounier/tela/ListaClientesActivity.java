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

import vitflamo.vitorlamounier.dao.ClienteDao;
import vitflamo.vitorlamounier.modelo.Cliente;

import java.io.Serializable;
import java.util.List;

public class ListaClientesActivity extends AppCompatActivity {
    private ListView listaAlunos;
    private List<Cliente> clientes;
    private static final int TELEFONE_CODE_REQUEST = 10;
    private Cliente clienteSelecionado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        listaAlunos = (ListView) findViewById(R.id.lista_alunos);

        Button botaoAdiciona = (Button) findViewById(R.id.lista_alunos_floating_button);

        botaoAdiciona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast
                Toast.makeText(ListaClientesActivity.this, "Floating button clicado", Toast.LENGTH_LONG).show();

                //chamar entao o formularioActivity
                Intent intent = new Intent(ListaClientesActivity.this, FormularioActivity.class);
                startActivity(intent);

            }
        });

        //Editando o aluno selecionado
        //Novo setOnItemClickListener
        listaAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent edicao = new Intent(ListaClientesActivity.this, FormularioActivity.class);
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

        ClienteDao dao = new ClienteDao(this);
        List<Cliente> clientes = dao.getLista();
        dao.close();
        ArrayAdapter<Cliente> adapter = new ArrayAdapter<Cliente>(this, android.R.layout.simple_list_item_1, clientes);
        this.listaAlunos.setAdapter(adapter);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, view, menuInfo);

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
        clienteSelecionado = (Cliente) listaAlunos.getAdapter().getItem(info.position);

        //Ligar
        MenuItem ligar = menu.add("Ligar");

        ligar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

                                             @Override
                                             public boolean onMenuItemClick(MenuItem item) {
                 String permissaoLigacao = android.Manifest.permission.CALL_PHONE;
                 if (ActivityCompat.checkSelfPermission(ListaClientesActivity.this, permissaoLigacao) == PackageManager.PERMISSION_GRANTED) {
                     fazerLigacao();
                 } else {
                     ActivityCompat.requestPermissions(ListaClientesActivity.this, new String[]{permissaoLigacao}, TELEFONE_CODE_REQUEST);
                 }
                 return false;
             }
         }
        );

        //Enviar SMS

        MenuItem sms = menu.add("Enviar SMS");
        Intent intentSms = new Intent(Intent.ACTION_VIEW);
        intentSms.setData(Uri.parse("sms:" + clienteSelecionado.getTelefone()));
        intentSms.putExtra("sms_body", "Mensagem");
        sms.setIntent(intentSms);


        //site
        MenuItem site = menu.add("Navegar no site");
        Intent intentSite = new Intent(Intent.ACTION_VIEW);
        intentSite.setData(Uri.parse("http:" + clienteSelecionado.getSite()));
        site.setIntent(intentSite);

        //Mapa
        MenuItem mapa = menu.add("Achar o mapa");
        Intent intentMapa = new Intent(Intent.ACTION_VIEW);
        intentMapa.setData(Uri.parse("geo:0.0?z=14&q=" + Uri.encode(clienteSelecionado.getEndereco())));
        mapa.setIntent(intentMapa);


        MenuItem deletar = menu.add("Deletar");
        deletar.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

            //Metodo para deletar
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                //para deletar ca xta a acaoa do metodo
                ClienteDao dao = new ClienteDao(ListaClientesActivity.this);
                dao.deletar(clienteSelecionado);
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
        intentLigar.setData(Uri.parse("tel:" + clienteSelecionado.getTelefone())); //CUIDADO O NOME DENTRO DE "" DEVE XTAR EM MINIUSCULA tel
        startActivity(intentLigar);
        //Este erro de startActivity nao tem problema

    }

}