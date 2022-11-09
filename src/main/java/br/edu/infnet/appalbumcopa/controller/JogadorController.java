package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class JogadorController {

    private static Map<Integer, Jogador> mapa = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Jogador jogador) {
        jogador.setId(id++);
        mapa.put(jogador.getId(), jogador);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Jogador> obterLista() {
        return mapa.values();
    }

    @GetMapping(value = "/jogador/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "jogador/lista";
    }

    @GetMapping(value = "/jogador/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/jogador/lista";
    }
}