package br.com.redelem.bean;

public class Acontecimento {

    private int acod; //Código do Acontecimento
    private String atitulo; //Título do Acontecimento
    private String adata; //Data do Usuário
    private String ainfo; //Descrição do Acontecimento
    
    //Contrutor
    public Acontecimento (int acod, String atitulo,String adata, String ainfo) {
        this.acod = acod;
        this.atitulo = atitulo;
        this.adata = adata;
        this.ainfo = ainfo;
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
