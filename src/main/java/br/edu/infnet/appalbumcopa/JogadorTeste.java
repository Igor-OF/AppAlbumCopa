package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.controller.JogadorController;
import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JogadorTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE JOGADORES ##");

        Jogador j1 = new Jogador();
        j1.setCodigo("BRA17");
        j1.setTipo(Tipo.OURO);
        j1.setNome("Neymar");
        j1.setSelecao(Selecao.BRASIL);
        j1.setPosicao(Posicao.ATACANTE);
        System.out.println("Jogador - " + j1);
        JogadorController.incluir(j1);

        Jogador j2 = new Jogador();
        j2.setCodigo("ARG20");
        j2.setTipo(Tipo.PRATA);
        j2.setNome("Messi");
        j2.setSelecao(Selecao.ARGENTINA);
        j2.setPosicao(Posicao.ATACANTE);
        System.out.println("Jogador - " + j2);
        JogadorController.incluir(j2);

        Jogador j3 = new Jogador();
        j3.setCodigo("POR19");
        j3.setTipo(Tipo.BRONZE);
        j3.setNome("Cristiano Ronaldo");
        j3.setSelecao(Selecao.PORTUGAL);
        j3.setPosicao(Posicao.ATACANTE);
        System.out.println("Jogador - " + j3);
        JogadorController.incluir(j3);
    }
}
