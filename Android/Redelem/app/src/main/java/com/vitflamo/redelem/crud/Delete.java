package com.vitflamo.redelem.crud;

import android.database.sqlite.SQLiteDatabase;

import com.vitflamo.redelem.Memoria;

public class Delete {


    public void removerTabela() {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        String query = "DROP TABLE IF EXISTS " + MainDB.TABELA_MEMORIA;
        db.execSQL(query);

    }

    public boolean removerMemoria(Memoria memoria) {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        String query = "ID = '" + memoria.getID() + "'";
        return db.delete(MainDB.TABELA_MEMORIA, query, null) > 0;

    }


}
