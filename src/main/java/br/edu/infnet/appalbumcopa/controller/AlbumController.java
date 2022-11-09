package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping(value = "/album/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", albumService.obterLista());

        return "album/lista";
    }

    @GetMapping(value = "/album/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        albumService.excluir(id);
        return "redirect:/album/lista";
    }
}
