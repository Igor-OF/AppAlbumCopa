package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Remessa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RemessaController {

    private static Map<Integer, Remessa> mapa = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Remessa remessa) {
        remessa.setId(id++);
        mapa.put(remessa.getId(), remessa);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Remessa> obterLista() {
        return mapa.values();
    }

    @GetMapping(value = "/remessa/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "remessa/lista";
    }

    @GetMapping(value = "/remessa/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/remessa/lista";
    }
}
