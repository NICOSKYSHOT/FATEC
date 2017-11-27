package com.vitflamo.redelem.crud;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.vitflamo.redelem.MyApp;

public class MainDB extends SQLiteOpenHelper {

    private static String NOME_DB = "DB";
    private static int VERSAO_DB = 1;
    public static String TABELA_MEMORIA= "TABELA_MEMORIA";


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
