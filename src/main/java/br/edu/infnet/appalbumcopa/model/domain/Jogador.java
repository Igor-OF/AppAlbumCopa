package br.edu.infnet.appalbumcopa.model.domain;

public class Jogador extends Figurinha {

    public String nome;
    public String selecao;
    public String posicao;

    @Override
    public String toString() {
        return nome + "; " + selecao + "; " + posicao;
    }
}
