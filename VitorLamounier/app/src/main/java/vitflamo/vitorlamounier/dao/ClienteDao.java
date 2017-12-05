package vitflamo.vitorlamounier.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import vitflamo.vitorlamounier.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android5908 on 07/04/16.
 */
public class ClienteDao extends SQLiteOpenHelper {

    private  static final int VERSAO = 2;
    //private static final int VERSAO = 1;   mudamos a versao de 1 para 2 para fazer o upgrade
    private static final String TABELA = "Clientes";
    private static final String DATABASE = "VitorLamounier";

    public ClienteDao(Context context)    {

        super(context, DATABASE, null, VERSAO);
    }

    public void onCreate(SQLiteDatabase database)    {
        String ddl = "CREATE TABLE " + TABELA
                +" (id INTEGER PRIMARY KEY,"
                +" nome TEXT NOT NULL,"
                +" telefone TEXT,"
                +" endereco TEXT,"
                +" site TEXT,"
                +" caminhoFoto TEXT";
        database.execSQL(ddl);
        //camera: adicionaos isto no string ddl : +" caminhoFoto TEXT);";
    }

    public void onUpgrade(SQLiteDatabase database, int versaoAntiga, int versaoNova) {
        String sql = "ALTER TABLE " + TABELA + " ADD COLUMN caminhoFoto TEXT; ";
        database.execSQL(sql);
        //camera: adicionamos ADD COLUMN caminhoFoto TEXT
    }

    public void insere(Cliente cliente) {
        ContentValues values = new ContentValues();
        values.put("nome", cliente.getNome());
        values.put("telefone", cliente.getTelefone());
        values.put("endereco", cliente.getEndereco());
        values.put("site", cliente.getSite());
       // values.put("genero", cliente.getGenero());
        //camera
        values.put("caminhoFoto", cliente.getCaminhoFoto());
        getWritableDatabase().insert(TABELA, null, values);

    }

    public List<Cliente> getLista() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + TABELA + ";", null);

        while (c.moveToNext())
        {
            Cliente cliente = new Cliente();
            cliente.setId(c.getLong(c.getColumnIndex("id")));
            cliente.setNome(c.getString(c.getColumnIndex("nome")));
            cliente.setTelefone(c.getString(c.getColumnIndex("telefone")));
            cliente.setEndereco(c.getString(c.getColumnIndex("endereco")));
            cliente.setSite(c.getString(c.getColumnIndex("site")));
            //camera
            cliente.setCaminhoFoto(c.getString(c.getColumnIndex("caminhoFoto")));

            clientes.add(cliente);
        }
        c.close();
        return clientes;
    }

    public void deletar(Cliente cliente) {
        String [] args = {cliente.getId().toString()};
        getWritableDatabase().delete(TABELA, "id=?", args);
    }

    public void alterar(Cliente cliente){

        ContentValues values = new  ContentValues();
        values.put("nome", cliente.getNome());
        values.put("telefone", cliente.getTelefone());
        values.put("endereco", cliente.getEndereco());
        values.put("site", cliente.getSite());
        //values.put("genero", cliente.getGenero());
        //camera
        values.put("caminhoFoto", cliente.getCaminhoFoto());

        getWritableDatabase().update(TABELA, values, "id=?", new String[] {cliente.getId().toString()});
    }
}
