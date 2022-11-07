package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import br.edu.infnet.appalbumcopa.model.domain.Remessa;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class RemessaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Album album = new Album();
        album.nomeDono = "Igor";
        album.dataAquisicao = LocalDate.of(2022,6,14);
        album.figurinhas = new ArrayList();

        Remessa r1 = new Remessa();
        r1.data = LocalDate.of(2022, 10, 10);
        r1.album = album;
        r1.figurinhas = new ArrayList();
        System.out.println("Remessa - " + r1);

        Remessa r2 = new Remessa();
        r2.data = LocalDate.of(2022, 10, 15);
        r2.album = album;
        r2.figurinhas = new ArrayList();
        System.out.println("Remessa - " + r2);

        Remessa r3 = new Remessa();
        r3.data = LocalDate.of(2022, 10, 20);
        r3.album = album;
        r3.figurinhas = new ArrayList();
        System.out.println("Remessa - " + r3);
    }
}
