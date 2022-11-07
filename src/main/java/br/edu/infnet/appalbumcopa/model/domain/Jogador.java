package br.edu.infnet.appalbumcopa.model.domain;

import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;

public class Jogador extends Figurinha {

    public String nome;
    public Selecao selecao;
    public Posicao posicao;

    @Override
    public String toString() {
        return nome + "; " + selecao + "; " + posicao;
    }
}
