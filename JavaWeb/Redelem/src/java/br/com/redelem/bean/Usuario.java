package br.com.redelem.bean;

public class Usuario {
    
    private int uid; //Còdgigo do Usuário
    private String unome; //Nome do Usuário
    private String ulogin; //Login do Usuário
    private String usenha; //Senha do Usuário
    private String unasc; //Data de Nascimento do Usuário 
    private String utipo; //Tipo de Usuário (adm ou comum)
    
    //Construtor
    public Usuario (int uid, String unome,String ulogin, String usenha, String unasc, String utipo) {
        this.uid = uid;
        this.unome = unome;
        this.ulogin = ulogin;
        this.usenha = usenha;
        this.unasc = unasc;
        this.utipo = utipo;
    }

    //Getters e Setters
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUnome() {
        return unome;
    }
    public void setUnome(String unome) {
        this.unome = unome;
    }
    public String getUlogin() {
        return ulogin;
    }
    public void setUlogin(String ulogin) {
        this.ulogin = ulogin;
    }
    public String getUsenha() {
        return usenha;
    }
    public void setUsenha(String usenha) {
        this.usenha = usenha;
    }
    public String getUnasc() {
        return unasc;
    }
    public void setUnasc(String unasc) {
        this.unasc = unasc;
    }
    public String getUtipo() {
        return utipo;
    }
    public void setUtipo(String utipo) {
        this.utipo = utipo;
    }

}