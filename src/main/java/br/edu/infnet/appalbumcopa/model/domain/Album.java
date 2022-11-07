package br.edu.infnet.appalbumcopa.model.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nomeDono;
    private LocalDate dataAquisicao;
    private List<Figurinha> figurinhas;

    public Album() {
        this.figurinhas = new ArrayList();
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void addFigurinha(Figurinha figurinha) {
        this.figurinhas.add(figurinha);
    }

    @Override
    public String toString() {
        return nomeDono + "; " + dataAquisicao + "; " + figurinhas.size();
    }
}
