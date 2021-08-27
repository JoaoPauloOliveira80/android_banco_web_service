package br.com.webserviceteste.model;

public class Estado {

    private int id;
    private String nome;
    private String sigla;

    public Estado(){}

    public Estado(int id, String nome, String sigla){

        this.setId(id);
        this.setNome(nome);
        this.setSigla(sigla);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
