package br.edu.infnet.appalbumcopa.model.domain;

import java.time.LocalDate;

public class Album {

    private Integer id;
    private String nomeDono;
    private LocalDate dataAquisicao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return nomeDono + "; " + dataAquisicao;
    }
}
