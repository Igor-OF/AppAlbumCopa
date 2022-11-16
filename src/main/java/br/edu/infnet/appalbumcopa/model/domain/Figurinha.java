package br.edu.infnet.appalbumcopa.model.domain;

import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;

import javax.persistence.*;

@Entity
@Table(name = "tfigurinha")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Figurinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return id + "; " + codigo + "; " + tipo;
    }
}
