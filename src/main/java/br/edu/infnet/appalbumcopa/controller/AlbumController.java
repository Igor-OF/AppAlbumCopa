package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.domain.Estadio;
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
public class AlbumController {

    @GetMapping(value = "/album/lista")
    public String telaLista(Model model) {

        Album a1 = new Album();
        a1.setNomeDono("Igor");
        a1.setDataAquisicao(LocalDate.of(2022, 8, 10));

        Album a2 = new Album();
        a2.setNomeDono("Beatriz");
        a2.setDataAquisicao(LocalDate.of(2022, 4, 14));

        Album a3 = new Album();
        a3.setNomeDono("Mariana");
        a3.setDataAquisicao(LocalDate.of(2022, 5, 6));

        List<Album> albuns = new ArrayList<>();
        albuns.add(a1);
        albuns.add(a2);
        albuns.add(a3);

        model.addAttribute("listagem", albuns);

        return "album/lista";
    }
}
