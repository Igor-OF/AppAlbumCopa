package br.edu.infnet.appalbumcopa.model.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Remessa {

    private Integer id;
    private LocalDateTime data;
    private Album album;
    private List<Figurinha> figurinhas;

    public Remessa() {
        this.data = LocalDateTime.now();
        this.figurinhas = new ArrayList<>();
    }

    public Remessa(Album album) {
        this();
        this.album = album;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
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

    public void setFigurinhas(List<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }

    public void addFigurinha(Figurinha figurinha) {
        this.figurinhas.add(figurinha);
    }

    @Override
    public String toString() {
        return data + "; " + album + "; " + figurinhas.size();
    }
}
