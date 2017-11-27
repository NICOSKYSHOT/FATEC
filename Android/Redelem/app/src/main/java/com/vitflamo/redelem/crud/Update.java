package com.vitflamo.redelem.crud;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.vitflamo.redelem.Memoria;


public class Update {

    public boolean addMemoria(Memoria memoria) {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("ID", memoria.getID());
        cv.put("TITULO", memoria.getTitulo());
        cv.put("DATA", memoria.getData());
        cv.put("INFO", memoria.getInfo());
        cv.put("FAVORITO", memoria.isFavorito());

        return db.insert(MainDB.TABELA_MEMORIA, null, cv) != -1;

    }

    public boolean updateMemoria(Memoria memoria) {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("ID", memoria.getID());
        cv.put("TITULO", memoria.getTitulo());
        cv.put("DATA", memoria.getData());
        cv.put("INFO", memoria.getInfo());
        cv.put("FAVORITO", memoria.isFavorito());

        String where = "ID = '" + memoria.getID() + "'";

        return db.update(MainDB.TABELA_MEMORIA, cv, where, null) > 0;

    }


}
