package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CampeaoController {

    private static Map<Integer, Campeao> mapa = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Campeao campeao) {
        campeao.setId(id++);
        mapa.put(campeao.getId(), campeao);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Campeao> obterLista() {
        return mapa.values();
    }

    @GetMapping(value = "/campeao/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "campeao/lista";
    }

    @GetMapping(value = "/campeao/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/campeao/lista";
    }
}
