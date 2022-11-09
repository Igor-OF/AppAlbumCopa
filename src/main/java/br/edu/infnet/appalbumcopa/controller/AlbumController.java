package br.edu.infnet.appalbumcopa.controller;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AlbumController {

    private static Map<Integer, Album> mapa = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Album album) {
        album.setId(id++);
        mapa.put(album.getId(), album);
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Album> obterLista() {
        return mapa.values();
    }

    @GetMapping(value = "/album/lista")
    public String telaLista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "album/lista";
    }

    @GetMapping(value = "/album/{id}/exclusao")
    public String exclusao(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/album/lista";
    }
}
