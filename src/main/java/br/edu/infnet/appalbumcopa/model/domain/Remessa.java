package br.edu.infnet.appalbumcopa.model.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tremessa")
public class Remessa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime data;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idAlbum")
    private Album album;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Figurinha> figurinhas;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return data + "; " + album + "; " + figurinhas.size();
    }
}
