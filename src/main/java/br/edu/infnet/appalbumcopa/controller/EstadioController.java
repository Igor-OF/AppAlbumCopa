package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.service.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class EstadioController {

    @Autowired
    private EstadioService estadioService;

    @GetMapping(value = "/estadio/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", estadioService.obterLista());

        return "estadio/lista";
    }

    @GetMapping(value = "/estadio")
    public String telaCadastro() {
        return "estadio/cadastro";
    }

    @PostMapping(value = "/estadio/inclusao")
    public String inclusao(Estadio estadio, @SessionAttribute("user") Usuario usuario) {
        estadio.setUsuario(usuario);
        estadioService.incluir(estadio);
        return "redirect:/estadio/lista";
    }

    @GetMapping(value = "/estadio/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        estadioService.excluir(id);
        return "redirect:/estadio/lista";
    }
}
