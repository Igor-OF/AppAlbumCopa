package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.*;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class RemessaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE REMESSAS ##");

        Jogador j1 = new Jogador();
        j1.setCodigo("BRA17");
        j1.setTipo(Tipo.OURO);
        j1.setNome("Neymar");
        j1.setSelecao(Selecao.BRASIL);
        j1.setPosicao(Posicao.ATACANTE);
        System.out.println("Jogador - " + j1);

        Estadio e1 = new Estadio();
        e1.setCodigo("FWC01");
        e1.setTipo(Tipo.COMUM);
        e1.setNome("Al Bayt");
        e1.setCidade("Al Khor");
        e1.setCapacidade(60000);
        System.out.println("Estadio - " + e1);

        Campeao c1 = new Campeao();
        c1.setCodigo("FWC23");
        c1.setTipo(Tipo.COMUM);
        c1.setPartida("Brasil 5x2 Suécia");
        c1.setData(LocalDate.of(1958, 6, 29));
        System.out.println("Campeao - " + c1);

        Album album = new Album();
        album.setNomeDono("Igor");
        album.setDataAquisicao(LocalDate.of(2022,6,14));

        Remessa r1 = new Remessa();
        r1.setData(LocalDate.of(2022, 10, 10));
        r1.setAlbum(album);
        r1.addFigurinha(j1);
        System.out.println("Remessa - " + r1);

        Remessa r2 = new Remessa();
        r2.setData(LocalDate.of(2022, 10, 15));
        r2.setAlbum(album);
        r2.addFigurinha(e1);
        System.out.println("Remessa - " + r2);

        Remessa r3 = new Remessa();
        r3.setData(LocalDate.of(2022, 10, 20));
        r3.setAlbum(album);
        r3.addFigurinha(c1);
        System.out.println("Remessa - " + r3);
    }
}
