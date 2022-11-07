package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class AlbumTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Album a1 = new Album();
        a1.nomeDono = "Igor";
        a1.dataAquisicao = LocalDate.of(2022, 8, 10);
        a1.figurinhas = new ArrayList();
        System.out.println("Album - " + a1);

        Album a2 = new Album();
        a2.nomeDono = "Beatriz";
        a2.dataAquisicao = LocalDate.of(2022, 4, 14);
        a2.figurinhas = new ArrayList();
        System.out.println("Album - " + a2);

        Album a3 = new Album();
        a3.nomeDono = "Mariana";
        a3.dataAquisicao = LocalDate.of(2022, 5, 6);
        a3.figurinhas = new ArrayList();
        System.out.println("Album - " + a3);
    }
}
