package br.edu.infnet.appalbumcopa.model.domain;

import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;

public class Figurinha {

    public String codigo;
    public Tipo tipo;

    @Override
    public String toString() {
        return codigo + "; " + tipo;
    }
}
