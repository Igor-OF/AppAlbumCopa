package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping(value = "/jogador/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", jogadorService.obterLista());

        return "jogador/lista";
    }

    @GetMapping(value = "/jogador")
    public String telaCadastro() {
        return "jogador/cadastro";
    }

    @PostMapping(value = "/jogador/inclusao")
    public String inclusao(Jogador jogador, @SessionAttribute("user") Usuario usuario) {
        jogador.setUsuario(usuario);
        jogadorService.incluir(jogador);
        return "redirect:/jogador/lista";
    }

    @GetMapping(value = "/jogador/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        jogadorService.excluir(id);
        return "redirect:/jogador/lista";
    }
}
