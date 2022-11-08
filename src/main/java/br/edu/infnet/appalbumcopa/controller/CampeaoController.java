package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CampeaoController {

    @GetMapping(value = "/campeao/lista")
    public String telaLista(Model model) {

        Campeao c1 = new Campeao();
        c1.setCodigo("FWC23");
        c1.setTipo(Tipo.COMUM);
        c1.setPartida("Brasil 5x2 Suécia");
        c1.setData(LocalDate.of(1958, 6, 29));

        Campeao c2 = new Campeao();
        c2.setCodigo("FWC24");
        c2.setTipo(Tipo.COMUM);
        c2.setPartida("Brasil 4x1 Itália");
        c2.setData(LocalDate.of(1970, 6, 21));

        Campeao c3 = new Campeao();
        c3.setCodigo("FWC25");
        c3.setTipo(Tipo.COMUM);
        c3.setPartida("Brasil 2x0 Alemanha");
        c3.setData(LocalDate.of(2002, 6, 30));

        List<Campeao> campeoes = new ArrayList<>();
        campeoes.add(c1);
        campeoes.add(c2);
        campeoes.add(c3);

        model.addAttribute("listagem", campeoes);

        return "campeao/lista";
    }
}
