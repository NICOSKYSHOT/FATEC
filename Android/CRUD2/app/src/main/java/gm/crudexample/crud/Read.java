package gm.crudexample.crud;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import gm.crudexample.Pessoa;

/**
 * Created by Gilian Marques on 28/09/2017.
 */

public class Read {

    public ArrayList<Pessoa> getPessoas() {

        SQLiteDatabase db = MainDB.getInstancia().getReadableDatabase();
        String query = "SELECT * FROM " + MainDB.TABELA_PESSOA;
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Cursor c = db.rawQuery(query, null);

        if (c.moveToFirst()) {

            do {
                Pessoa pessoa = new Pessoa(c.getString(0));
                pessoa.setNome(c.getString(1));
                pessoa.setIdade(c.getInt(2));
                pessoa.setPeso(c.getDouble(3));
                pessoa.setDeficiencia(c.getInt(4) == 1);
                pessoas.add(pessoa);
            } while (c.moveToNext());
        }

        c.close();
        return pessoas;
    }

}
