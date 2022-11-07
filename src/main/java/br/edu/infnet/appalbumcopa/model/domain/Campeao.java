package br.edu.infnet.appalbumcopa.model.domain;

import java.time.LocalDate;

public class Campeao extends Figurinha {

    public String partida;
    public LocalDate data;

    @Override
    public String toString() {
        return partida + "; " + data;
    }
}
