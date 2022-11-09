package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping(value = "/jogador/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", jogadorService.obterLista());

        return "jogador/lista";
    }

    @GetMapping(value = "/jogador/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        jogadorService.excluir(id);
        return "redirect:/jogador/lista";
    }
}
