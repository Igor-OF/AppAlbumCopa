package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import br.edu.infnet.appalbumcopa.model.domain.Figurinha;
import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FigurinhaController {

    @GetMapping(value = "/figurinha/lista")
    public String telaLista(Model model) {

        Jogador jogador = new Jogador();
        jogador.setCodigo("BRA17");
        jogador.setTipo(Tipo.OURO);
        jogador.setNome("Neymar");
        jogador.setSelecao(Selecao.BRASIL);
        jogador.setPosicao(Posicao.ATACANTE);

        Estadio estadio = new Estadio();
        estadio.setCodigo("FWC01");
        estadio.setTipo(Tipo.COMUM);
        estadio.setNome("Al Bayt");
        estadio.setCidade("Al Khor");
        estadio.setCapacidade(60000);

        Campeao campeao = new Campeao();
        campeao.setCodigo("FWC23");
        campeao.setTipo(Tipo.COMUM);
        campeao.setPartida("Brasil 5x2 Suécia");
        campeao.setData(LocalDate.of(1958, 6, 29));

        List<Figurinha> figurinhas = new ArrayList<>();
        figurinhas.add(jogador);
        figurinhas.add(estadio);
        figurinhas.add(campeao);

        model.addAttribute("listagem", figurinhas);

        return "figurinha/lista";
    }
}
