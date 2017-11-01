/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.dbs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *
 * @author ProfAlexandre
 */
public class BancoHelper extends SQLiteOpenHelper{
    
    private static final String NOME_BANCO = "RESGATFATEC.db";
    public static final String TABELA = "USUARIOS";

    private static final int VERSAO_SCHEMA = 1;
    private final String S_CREATE;

    public BancoHelper(Context context) {
	super(context, NOME_BANCO, null, VERSAO_SCHEMA);		
        this.S_CREATE = "CREATE TABLE USUARIOS (ID INTEGER PRIMARY KEY AUTOINCREMENT,LOGIN TEXT,SENHA TEXT,STATUS TEXT,TIPO TEXT);";
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
	db.execSQL(S_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);
    }
    
}
