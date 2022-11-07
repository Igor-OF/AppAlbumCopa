package br.edu.infnet.appalbumcopa.model.domain;

import java.time.LocalDate;
import java.util.List;

public class Album {

    public String nomeDono;
    public LocalDate dataAquisicao;
    public List<Figurinha> figurinhas;

    @Override
    public String toString() {
        return nomeDono + "; " + dataAquisicao + "; " + figurinhas.size();
    }
}
