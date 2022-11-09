package br.edu.infnet.appalbumcopa.model.domain;

import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;

public abstract class Figurinha {

    private Integer id;
    private String codigo;
    private Tipo tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return id + "; " + codigo + "; " + tipo;
    }
}
