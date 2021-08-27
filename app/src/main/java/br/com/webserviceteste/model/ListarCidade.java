package br.com.webserviceteste.model;

public class ListarCidade {
    String cidade;

    public ListarCidade(){

    }

    public ListarCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
