package gm.crudexample.crud;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import gm.crudexample.MyApp;

/**
 * Created by Gilian Marques on 28/09/2017.
 *
 * @see : https://developer.android.com/reference/android/database/sqlite/SQLiteOpenHelper.html#getReadableDatabase%28%29
 */

public class MainDB extends SQLiteOpenHelper {

    private static String NOME_DB = "DB";
    private static int VERSAO_DB = 1;
    public static String TABELA_PESSOA = "TABELA_PESSOA";


    private static MainDB instancia;


    public static MainDB getInstancia() {
        if (instancia == null) instancia = new MainDB();
        return instancia;
    }


    private MainDB() {
        super(MyApp.getContext(), NOME_DB, null, VERSAO_DB);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    @Override
    public synchronized void close() {
        instancia = null;
        super.close();
    }
}
