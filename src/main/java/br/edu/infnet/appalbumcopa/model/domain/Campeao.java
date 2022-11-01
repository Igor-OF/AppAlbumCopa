package br.edu.infnet.appalbumcopa.model.domain;

public class Campeao extends Figurinha {

    public String selecao;
    public String Ano;
    public String resultadoPartida;

    @Override
    public String toString() {
        return selecao + "; " + Ano + "; " + resultadoPartida;
    }
}
