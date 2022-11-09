package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.service.CampeaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CampeaoController {

    @Autowired
    private CampeaoService campeaoService;

    @GetMapping(value = "/campeao/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", campeaoService.obterLista());

        return "campeao/lista";
    }

    @GetMapping(value = "/campeao/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        campeaoService.excluir(id);
        return "redirect:/campeao/lista";
    }
}
