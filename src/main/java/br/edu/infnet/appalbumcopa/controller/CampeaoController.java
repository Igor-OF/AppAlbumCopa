package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.service.CampeaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CampeaoController {

    @Autowired
    private CampeaoService campeaoService;

    @GetMapping(value = "/campeao/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", campeaoService.obterLista());

        return "campeao/lista";
    }

    @GetMapping(value = "/campeao")
    public String telaCadastro() {
        return "campeao/cadastro";
    }

    @PostMapping(value = "/campeao/inclusao")
    public String inclusao(Campeao campeao, @SessionAttribute("user") Usuario usuario) {
        campeao.setUsuario(usuario);
        campeaoService.incluir(campeao);
        return "redirect:/campeao/lista";
    }

    @GetMapping(value = "/campeao/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        campeaoService.excluir(id);
        return "redirect:/campeao/lista";
    }
}
