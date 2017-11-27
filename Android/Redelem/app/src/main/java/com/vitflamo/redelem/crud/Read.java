package com.vitflamo.redelem.crud;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import com.vitflamo.redelem.Memoria;

public class Read {

    public ArrayList<Memoria> getMemorias() {

        SQLiteDatabase db = MainDB.getInstancia().getReadableDatabase();
        String query = "SELECT * FROM " + MainDB.TABELA_MEMORIA;
        ArrayList<Memoria> memorias = new ArrayList<>();
        Cursor c = db.rawQuery(query, null);

        if (c.moveToFirst()) {

            do {
                Memoria memoria = new Memoria(c.getString(0));
                memoria.setTitulo(c.getString(1));
                memoria.setData(c.getString(2));
                memoria.setInfo(c.getString(3));
                memoria.setFavorito(c.getInt(4) == 1);
                memorias.add(memoria);
            } while (c.moveToNext());
        }

        c.close();
        return memorias;
    }

}
