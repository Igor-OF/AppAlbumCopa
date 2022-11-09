package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.service.FigurinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FigurinhaController {

    @Autowired
    private FigurinhaService figurinhaService;

    @GetMapping(value = "/figurinha/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", figurinhaService.obterLista());

        return "figurinha/lista";
    }

    @GetMapping(value = "/figurinha/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        figurinhaService.excluir(id);
        return "redirect:/figurinha/lista";
    }
}
