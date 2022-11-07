package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JogadorTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Jogador j1 = new Jogador();
        j1.nome = "Neymar";
        j1.selecao = Selecao.BRASIL;
        j1.posicao = Posicao.ATACANTE;
        System.out.println("Jogador - " + j1);

        Jogador j2 = new Jogador();
        j2.nome = "Messi";
        j2.selecao = Selecao.ARGENTINA;
        j2.posicao = Posicao.ATACANTE;
        System.out.println("Jogador - " + j2);

        Jogador j3 = new Jogador();
        j3.nome = "Cristiano Ronaldo";
        j3.selecao = Selecao.PORTUGAL;
        j3.posicao = Posicao.ATACANTE;
        System.out.println("Jogador - " + j3);
    }
}
