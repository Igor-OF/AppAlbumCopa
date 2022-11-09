package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import br.edu.infnet.appalbumcopa.model.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AlbumTeste implements ApplicationRunner {

    @Autowired
    private AlbumService albumService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE ALBUNS ##");

        Album a1 = new Album();
        a1.setNomeDono("Igor");
        a1.setDataAquisicao(LocalDate.of(2022, 8, 10));
        System.out.println("Album - " + a1);
        albumService.incluir(a1);

        Album a2 = new Album();
        a2.setNomeDono("Beatriz");
        a2.setDataAquisicao(LocalDate.of(2022, 4, 14));
        System.out.println("Album - " + a2);
        albumService.incluir(a2);

        Album a3 = new Album();
        a3.setNomeDono("Mariana");
        a3.setDataAquisicao(LocalDate.of(2022, 5, 6));
        System.out.println("Album - " + a3);
        albumService.incluir(a3);
    }
}
