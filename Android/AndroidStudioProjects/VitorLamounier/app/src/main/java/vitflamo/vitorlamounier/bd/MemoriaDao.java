package vitflamo.vitorlamounier.bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import vitflamo.vitorlamounier.bean.Memoria;

public class MemoriaDao extends SQLiteOpenHelper {

    private  static final int VERSAO = 2;
    //private static final int VERSAO = 1;   mudamos a versao de 1 para 2 para fazer o upgrade
    private static final String TABELA = "Memorias";
    private static final String DATABASE = "Redelem";

    public MemoriaDao(Context context){

        super(context, DATABASE, null, VERSAO);
    }

    public void onCreate(SQLiteDatabase database) {
        String ddl = "CREATE TABLE " + TABELA
                +" (id INTEGER PRIMARY KEY,"
                +" nome TEXT NOT NULL,"
                +" data TEXT,"
                +" info TEXT);";
        database.execSQL(ddl);
        //camera: adicionaos isto no string ddl : +" caminhoFoto TEXT);";
    }

    public void onUpgrade(SQLiteDatabase database, int versaoAntiga, int versaoNova) {
        String sql = "ALTER TABLE " + TABELA + " ADD COLUMN caminhoFoto TEXT; ";
        database.execSQL(sql);
        //camera: adicionamos ADD COLUMN caminhoFoto TEXT
    }

    public void insere(Memoria memoria) {

        ContentValues values = new ContentValues();
        values.put("nome", memoria.getNome());
        values.put("data", memoria.getData());
        values.put("info", memoria.getInfo());
        //camera
        values.put("caminhoFoto", memoria.getCaminhoFoto());

        getWritableDatabase().insert(TABELA, null, values);

    }

    public List<Memoria> getLista() {
        List<Memoria> memorias = new ArrayList<Memoria>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + TABELA + ";", null);

        while (c.moveToNext()){

            Memoria memoria = new Memoria();
            memoria.setId(c.getLong(c.getColumnIndex("id")));
            memoria.setNome(c.getString(c.getColumnIndex("nome")));
            memoria.setData(c.getString(c.getColumnIndex("data")));
            memoria.setInfo(c.getString(c.getColumnIndex("info")));
            //camera
            memoria.setCaminhoFoto(c.getString(c.getColumnIndex("caminhoFoto")));

            memorias.add(memoria);
        }
        c.close();
        return memorias;
    }

    public void deletar(Memoria memoria){

        String [] args = {memoria.getId().toString()};
        getWritableDatabase().delete(TABELA, "id=?", args);
    }

    public void alterar(Memoria memoria){

        ContentValues values = new  ContentValues();
        values.put("nome", memoria.getNome());
        values.put("data", memoria.getData());
        values.put("info", memoria.getInfo());
        //camera
        values.put("caminhoFoto", memoria.getCaminhoFoto());

        getWritableDatabase().update(TABELA, values, "id=?", new String[] {
                memoria.getId().toString()
        });
    }
}
