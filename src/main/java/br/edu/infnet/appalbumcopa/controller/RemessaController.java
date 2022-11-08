package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.*;
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
public class RemessaController {

    @GetMapping(value = "/remessa/lista")
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

        Album album = new Album();
        album.setNomeDono("Igor");
        album.setDataAquisicao(LocalDate.of(2022,6,14));

        List<Figurinha> figurinhasPrimeiraRemessa = new ArrayList<>();
        figurinhasPrimeiraRemessa.add(jogador);
        figurinhasPrimeiraRemessa.add(estadio);

        List<Figurinha> figurinhasDemaisRemessas = new ArrayList<>();
        figurinhasDemaisRemessas.add(jogador);
        figurinhasDemaisRemessas.add(estadio);
        figurinhasDemaisRemessas.add(campeao);

        Remessa r1 = new Remessa();
        r1.setAlbum(album);
        r1.setFigurinhas(figurinhasPrimeiraRemessa);

        Remessa r2 = new Remessa();
        r2.setAlbum(album);
        r2.setFigurinhas(figurinhasDemaisRemessas);

        Remessa r3 = new Remessa(album);
        r3.setFigurinhas(figurinhasDemaisRemessas);

        List<Remessa> remessas = new ArrayList<>();
        remessas.add(r1);
        remessas.add(r2);
        remessas.add(r3);

        model.addAttribute("listagem", remessas);

        return "remessa/lista";
    }
}
