package com.vitflamo.redelem;

import java.util.Random;

public class Memoria {

    public Memoria(String ID) {
        this.ID = ID;
    }

    private final String ID;
    private String titulo;
    private String data;
    private String info;
    private boolean favorito;

    public String getID() {
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static String criarID() {
        return "@Memoria:" + System.currentTimeMillis() + new Random().nextDouble();
    }
}
