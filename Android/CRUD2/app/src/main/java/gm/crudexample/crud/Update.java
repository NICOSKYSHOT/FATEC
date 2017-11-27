package gm.crudexample.crud;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import gm.crudexample.Pessoa;

/**
 * Created by Gilian Marques on 28/09/2017.
 */

public class Update {

    public boolean addPessoa(Pessoa pessoa) {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("UID", pessoa.getUID());
        cv.put("NOME", pessoa.getNome());
        cv.put("IDADE", pessoa.getIdade());
        cv.put("PESO", pessoa.getPeso());
        cv.put("DEFICIENCIA", pessoa.isDeficiente());

        return db.insert(MainDB.TABELA_PESSOA, null, cv) != -1;

    }

    public boolean updatePessoa(Pessoa pessoa) {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("UID", pessoa.getUID());
        cv.put("NOME", pessoa.getNome());
        cv.put("IDADE", pessoa.getIdade());
        cv.put("PESO", pessoa.getPeso());
        cv.put("DEFICIENCIA", pessoa.isDeficiente());

        String where = "UID = '" + pessoa.getUID() + "'";

        return db.update(MainDB.TABELA_PESSOA, cv, where, null) > 0;

    }


}
