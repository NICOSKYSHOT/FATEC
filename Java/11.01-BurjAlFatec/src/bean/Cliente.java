package bean;

public class Cliente {

    private int id;
    private String nome;
    private String sexo;
    private String datanas;
    private String cpf;

    public Cliente(int id, String nome, String sexo, String datanas, String cpf) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.datanas = datanas;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatanas() {
        return datanas;
    }

    public void setDatanas(String datanas) {
        this.datanas = datanas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
       
}