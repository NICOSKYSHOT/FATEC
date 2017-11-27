package com.vitflamo.redelem.crud;

import android.database.sqlite.SQLiteDatabase;

public class Create {


    public void createTable() {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        String colunas = "( ID TEXT, TITULO TEXT, DATA TEXT, INFO TEXT, FAVORITO INTEGER )";
        String query = "CREATE TABLE IF NOT EXISTS " + MainDB.TABELA_MEMORIA + colunas;
        db.execSQL(query);

    }


}
