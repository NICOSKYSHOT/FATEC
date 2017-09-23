package br.com.redelem.bean;

public class Memoria {
    
    private int mcod;
    private String mcom;
    private int muid;
    private int macod;
    
    public Memoria (int mcodp, String mcomp,int muidp, int macodp) {
        this.mcod = mcodp;
        this.mcom = mcomp;
        this.muid = muidp;
        this.macod = macodp;
    }

    public int getMcod() {
        return mcod;
    }

    public void setMcod(int mcod) {
        this.mcod = mcod;
    }

    public String getMcom() {
        return mcom;
    }

    public void setMcom(String mcom) {
        this.mcom = mcom;
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

}