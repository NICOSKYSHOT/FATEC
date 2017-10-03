package br.com.redelem.bean;

public class Acontecimento {

    private int acod; //Código do Acontecimento
    private String atitulo; //Título do Acontecimento
    private String adata; //Data do Usuário
    private String ainfo; //Descrição do Acontecimento
    
    //Contrutor
    public Acontecimento (int acodp, String atitulop,String adatap, String ainfop) {
        this.acod = acodp;
        this.atitulo = atitulop;
        this.adata = adatap;
        this.ainfo = ainfop;
    }
    
    //Getters e Setters
    public int getAcod() {
        return acod;
    }
    public void setAcod(int acod) {
        this.acod = acod;
    }
    public String getAtitulo() {
        return atitulo;
    }
    public void setAtitulo(String atitulo) {
        this.atitulo = atitulo;
    }
    public String getAdata() {
        return adata;
    }
    public void setAdata(String adata) {
        this.adata = adata;
    }
    public String getAinfo() {
        return ainfo;
    }
    public void setAinfo(String ainfo) {
        this.ainfo = ainfo;
    }
}
