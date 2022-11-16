package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", usuarioService.obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/inclusao")
    public String inclusao(Usuario usuario) {
        usuarioService.incluir(usuario);
        return "redirect:/usuario/lista";
    }

    @GetMapping(value = "/usuario/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        usuarioService.excluir(id);
        return "redirect:/usuario/lista";
    }
}
