package br.com.redelem.bean;

public class Usuario {
    
    private int uid;
    private String unome;
    private String ulogin;
    private String usenha;
    private String unasc;
    private String utipo;
    
    public Usuario (int uidp, String unomep,String uloginp, String usenhap, String unascp, String utipop) {
        this.uid = uidp;
        this.unome = unomep;
        this.ulogin = uloginp;
        this.usenha = usenhap;
        this.unasc = unascp;
        this.utipo = utipop;
    }

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