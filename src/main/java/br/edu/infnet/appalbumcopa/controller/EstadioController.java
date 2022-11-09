package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EstadioController {

    private static Map<Integer, Estadio> mapa = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Estadio estadio) {
        estadio.setId(id++);
        mapa.put(estadio.getId(), estadio);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Estadio> obterLista() {
        return mapa.values();
    }

    @GetMapping(value = "/estadio/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "estadio/lista";
    }

    @GetMapping(value = "/estadio/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/estadio/lista";
    }
}
