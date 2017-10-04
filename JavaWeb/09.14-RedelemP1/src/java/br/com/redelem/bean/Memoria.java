package br.com.redelem.bean;

public class Memoria {
    
    private int mcod; //Memória Código
    private int muid; //Memória Usuário Código
    private int macod; //Memória Acontecimento Código 
    private String mcom; //Memória Comentário (aka Lembrança)
    
    private Usuario usu; //Usuário Estrangeiro
    private Acontecimento aco; //Acontecimento Estrangeiro

    //Construtor
    public Memoria(int mcod, int muid, int macod, String mcom) {
        this.mcod = mcod;
        this.muid = muid;
        this.macod = macod;
        this.mcom = mcom;
    }

    //Getters e Setters
    public int getMcod() {
        return mcod;
    }
    public void setMcod(int mcod) {
        this.mcod = mcod;
    }
    public int getMuid() {
        return muid;
    }
    public void setMuid(int muid) {
        this.muid = muid;
    }
    public int getMacod() {
        return macod;
    }
    public void setMacod(int macod) {
        this.macod = macod;
    }
    public String getMcom() {
        return mcom;
    }
    public void setMcom(String mcom) {
        this.mcom = mcom;
    }
    public Usuario getUsu() {
        return usu;
    }
    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
    public Acontecimento getAco() {
        return aco;
    }
    public void setAco(Acontecimento aco) {
        this.aco = aco;
    }

}