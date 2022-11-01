package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JogadorTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Jogador j1 = new Jogador();
        j1.nome = "Neymar";
        j1.selecao = "Brasil";
        j1.posicao = "Atacante";
        System.out.println("Jogador - " + j1);

        Jogador j2 = new Jogador();
        j2.nome = "Messi";
        j2.selecao = "Argentina";
        j2.posicao = "Atacante";
        System.out.println("Jogador - " + j2);

        Jogador j3 = new Jogador();
        j3.nome = "Cristiano Ronaldo";
        j3.selecao = "Portugal";
        j3.posicao = "Atacante";
        System.out.println("Jogador - " + j3);
    }
}
