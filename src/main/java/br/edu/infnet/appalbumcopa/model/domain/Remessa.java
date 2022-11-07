package br.edu.infnet.appalbumcopa.model.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Remessa {

    private LocalDate data;
    private Album album;
    private List<Figurinha> figurinhas;

    public Remessa() {
        this.figurinhas = new ArrayList();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void addFigurinha(Figurinha figurinha) {
        this.figurinhas.add(figurinha);
    }

    @Override
    public String toString() {
        return data + "; " + album + "; " + figurinhas.size();
    }
}
