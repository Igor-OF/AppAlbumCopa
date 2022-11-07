package br.edu.infnet.appalbumcopa.model.domain;

public class Estadio extends Figurinha {

    private String nome;
    private String cidade;
    private Integer capacidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + nome + "; " + cidade + "; " + capacidade;
    }
}
