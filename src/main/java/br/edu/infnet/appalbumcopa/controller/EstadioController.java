package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EstadioController {

    @GetMapping(value = "/estadio/lista")
    public String telaLista(Model model) {

        Estadio e1 = new Estadio();
        e1.setCodigo("FWC01");
        e1.setTipo(Tipo.COMUM);
        e1.setNome("Al Bayt");
        e1.setCidade("Al Khor");
        e1.setCapacidade(60000);

        Estadio e2 = new Estadio();
        e2.setCodigo("FWC02");
        e2.setTipo(Tipo.COMUM);
        e2.setNome("Ras Abu Aboud");
        e2.setCidade("Doha");
        e2.setCapacidade(40000);

        Estadio e3 = new Estadio();
        e3.setCodigo("FWC03");
        e3.setTipo(Tipo.COMUM);
        e3.setNome("Al Thumama");
        e3.setCidade("Doha");
        e3.setCapacidade(40000);

        List<Estadio> estadios = new ArrayList<>();
        estadios.add(e1);
        estadios.add(e2);
        estadios.add(e3);

        model.addAttribute("listagem", estadios);

        return "estadio/lista";
    }
}
