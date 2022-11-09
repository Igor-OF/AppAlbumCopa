package br.edu.infnet.appalbumcopa.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tcampeao")
public class Campeao extends Figurinha {

    private String partida;
    private LocalDate data;

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + partida + "; " + data;
    }
}
