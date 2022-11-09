package br.edu.infnet.appalbumcopa.model.domain;

import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tjogador")
public class Jogador extends Figurinha {

    private String nome;
    private Selecao selecao;
    private Posicao posicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Selecao getSelecao() {
        return selecao;
    }

    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + nome + "; " + selecao + "; " + posicao;
    }
}
