package vitflamo.vitorlamounier.modelo;

/**
 * Created by ProfAlexandre on 15/10/2017.
 */

import java.io.Serializable;

/**
 * Created by android5908 on 06/04/16.
 */
public class Cliente implements Serializable {

    private String nome;
    private String telefone;
    private String endereco;
    private String site;
    private Long id;

    //camera
    private String caminhoFoto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //camera

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    @Override
    public String toString() {
        return id + " - " + nome;
    }
}

