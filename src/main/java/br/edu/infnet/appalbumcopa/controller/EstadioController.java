package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.service.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EstadioController {

    @Autowired
    private EstadioService estadioService;

    @GetMapping(value = "/estadio/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", estadioService.obterLista());

        return "estadio/lista";
    }

    @GetMapping(value = "/estadio/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        estadioService.excluir(id);
        return "redirect:/estadio/lista";
    }
}
