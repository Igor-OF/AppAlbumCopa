package br.edu.infnet.appalbumcopa.model.domain;

import java.time.LocalDate;
import java.util.List;

public class Remessa {

    public LocalDate data;
    public Album album;
    public List<Figurinha> figurinhas;

    @Override
    public String toString() {
        return data + "; " + album + "; " + figurinhas.size();
    }
}
