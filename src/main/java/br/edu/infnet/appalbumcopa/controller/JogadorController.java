package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JogadorController {

    @GetMapping(value = "/jogador/lista")
    public String telaLista(Model model) {

        Jogador j1 = new Jogador();
        j1.setCodigo("BRA17");
        j1.setTipo(Tipo.OURO);
        j1.setNome("Neymar");
        j1.setSelecao(Selecao.BRASIL);
        j1.setPosicao(Posicao.ATACANTE);

        Jogador j2 = new Jogador();
        j2.setCodigo("ARG20");
        j2.setTipo(Tipo.PRATA);
        j2.setNome("Messi");
        j2.setSelecao(Selecao.ARGENTINA);
        j2.setPosicao(Posicao.ATACANTE);

        Jogador j3 = new Jogador();
        j3.setCodigo("POR19");
        j3.setTipo(Tipo.BRONZE);
        j3.setNome("Cristiano Ronaldo");
        j3.setSelecao(Selecao.PORTUGAL);
        j3.setPosicao(Posicao.ATACANTE);

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(j1);
        jogadores.add(j2);
        jogadores.add(j3);

        model.addAttribute("listagem", jogadores);

        return "jogador/lista";
    }
}
