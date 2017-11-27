package gm.crudexample;

import java.util.Random;

public class Pessoa {


    public Pessoa(String UID) {
        this.UID = UID;
    }

    private final String UID;
    private String nome;
    private int idade;
    private double peso;
    private boolean deficiencia;

    public String getUID() {
        return UID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDeficiente() {
        return deficiencia;
    }

    public void setDeficiencia(boolean deficiencia) {
        this.deficiencia = deficiencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return Uma identificaçao unica para o objeto Pessoa.
     */
    public static String criarUID() {
        return "@Pessoa:" + System.currentTimeMillis() + new Random().nextDouble();
    }
}
