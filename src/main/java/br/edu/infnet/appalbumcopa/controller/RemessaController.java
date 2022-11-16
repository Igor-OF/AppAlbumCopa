package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import br.edu.infnet.appalbumcopa.model.domain.Remessa;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.service.AlbumService;
import br.edu.infnet.appalbumcopa.model.service.FigurinhaService;
import br.edu.infnet.appalbumcopa.model.service.RemessaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RemessaController {

    @Autowired
    private RemessaService remessaService;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private FigurinhaService figurinhaService;

    @GetMapping(value = "/remessa/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", remessaService.obterLista(usuario));

        return "remessa/lista";
    }

    @GetMapping(value = "/remessa")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("albuns", albumService.obterLista(usuario));
        model.addAttribute("figurinhas", figurinhaService.obterLista(usuario));

        return "remessa/cadastro";
    }

    @PostMapping(value = "/remessa/inclusao")
    public String inclusao(Remessa remessa, @SessionAttribute("user") Usuario usuario) {
        remessa.setUsuario(usuario);
        remessaService.incluir(remessa);
        return "redirect:/remessa/lista";
    }

    @GetMapping(value = "/remessa/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        remessaService.excluir(id);
        return "redirect:/remessa/lista";
    }
}
