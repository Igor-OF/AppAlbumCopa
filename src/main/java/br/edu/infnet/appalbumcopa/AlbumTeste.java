package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class AlbumTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE ALBUNS ##");

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

        Album a1 = new Album();
        a1.setNomeDono("Igor");
        a1.setDataAquisicao(LocalDate.of(2022, 8, 10));
        a1.addFigurinha(j1);
        System.out.println("Album - " + a1);

        Album a2 = new Album();
        a2.setNomeDono("Beatriz");
        a2.setDataAquisicao(LocalDate.of(2022, 4, 14));
        a2.addFigurinha(e1);
        System.out.println("Album - " + a2);

        Album a3 = new Album();
        a3.setNomeDono("Mariana");
        a3.setDataAquisicao(LocalDate.of(2022, 5, 6));
        a3.addFigurinha(c1);
        System.out.println("Album - " + a3);
    }
}
