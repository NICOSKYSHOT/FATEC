package bean;

public class Quarto {

    private int cod;
    private String numero;
    private String tamanho;
    private String andar;
    private String tipo;

    public Quarto(int cod, String numero, String tamanho, String andar, String tipo) {
        this.cod = cod;
        this.numero = numero;
        this.tamanho = tamanho;
        this.andar = andar;
        this.tipo = tipo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}