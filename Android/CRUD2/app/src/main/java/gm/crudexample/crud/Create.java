package gm.crudexample.crud;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Gilian Marques on 28/09/2017.
 */

public class Create {


    public void createTable() {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        String colunas = "( UID TEXT, NOME TEXT, IDADE INTEGER, PESO REAL, DEFICIENCIA INTEGER )";
        String query = "CREATE TABLE IF NOT EXISTS " + MainDB.TABELA_PESSOA + colunas;
        db.execSQL(query);

    }


}
