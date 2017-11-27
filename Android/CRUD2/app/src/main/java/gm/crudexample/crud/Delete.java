package gm.crudexample.crud;

import android.database.sqlite.SQLiteDatabase;

import gm.crudexample.Pessoa;

/**
 * Created by Gilian Marques on 28/09/2017.
 */

public class Delete {


    public void removerTabela() {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        String query = "DROP TABLE IF EXISTS " + MainDB.TABELA_PESSOA;
        db.execSQL(query);

    }

    public boolean removerPessoa(Pessoa pessoa) {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        String query = "UID = '" + pessoa.getUID() + "'";
        return db.delete(MainDB.TABELA_PESSOA, query, null) > 0;

    }


}
