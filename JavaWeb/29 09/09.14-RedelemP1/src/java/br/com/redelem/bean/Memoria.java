package br.com.redelem.bean;

public class Memoria {
    
    private int mcod;
    private int muid;
    private int macod;
    
    private String mcom;
    private Usuario usu;
    private Acontecimento aco;
    
    public Memoria (int mcodp, int muidp, int macodp, String mcomp) {
        this.mcod = mcodp;
        this.muid = muidp;
        this.macod = macodp;
        this.mcom = mcomp;
    }

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

    
    //outras tabelas
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