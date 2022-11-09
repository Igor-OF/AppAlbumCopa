package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Figurinha;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FigurinhaController {

    private static Map<Integer, Figurinha> mapa = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Figurinha figurinha) {
        figurinha.setId(id++);
        mapa.put(figurinha.getId(), figurinha);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Figurinha> obterLista() {
        return mapa.values();
    }

    @GetMapping(value = "/figurinha/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "figurinha/lista";
    }

    @GetMapping(value = "/figurinha/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/figurinha/lista";
    }
}
