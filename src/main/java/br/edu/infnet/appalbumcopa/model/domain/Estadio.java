package br.edu.infnet.appalbumcopa.model.domain;

public class Estadio extends Figurinha {

    public String nome;
    public String cidade;
    public Integer capacidade;

    @Override
    public String toString() {
        return nome + "; " + cidade + "; " + capacidade;
    }
}
