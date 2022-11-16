package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.controller.RemessaController;
import br.edu.infnet.appalbumcopa.model.domain.*;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Order(2)
@Component
public class RemessaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE REMESSAS ##");

        Jogador jogador = new Jogador();
        jogador.setCodigo("BRA17");
        jogador.setTipo(Tipo.OURO);
        jogador.setNome("Neymar");
        jogador.setSelecao(Selecao.BRASIL);
        jogador.setPosicao(Posicao.ATACANTE);

        Estadio estadio = new Estadio();
        estadio.setCodigo("FWC01");
        estadio.setTipo(Tipo.COMUM);
        estadio.setNome("Al Bayt");
        estadio.setCidade("Al Khor");
        estadio.setCapacidade(60000);

        Campeao campeao = new Campeao();
        campeao.setCodigo("FWC23");
        campeao.setTipo(Tipo.COMUM);
        campeao.setPartida("Brasil 5x2 Suécia");
        campeao.setData(LocalDate.of(1958, 6, 29));

        Album album = new Album();
        album.setNomeDono("Igor");
        album.setDataAquisicao(LocalDate.of(2022,6,14));

        List<Figurinha> figurinhasPrimeiraRemessa = new ArrayList<>();
        figurinhasPrimeiraRemessa.add(jogador);
        figurinhasPrimeiraRemessa.add(estadio);

        List<Figurinha> figurinhasDemaisRemessas = new ArrayList<>();
        figurinhasDemaisRemessas.add(jogador);
        figurinhasDemaisRemessas.add(estadio);
        figurinhasDemaisRemessas.add(campeao);

        Remessa r1 = new Remessa();
        r1.setAlbum(album);
        r1.setFigurinhas(figurinhasPrimeiraRemessa);
        System.out.println("Remessa - " + r1);
        RemessaController.incluir(r1);

        Remessa r2 = new Remessa();
        r2.setAlbum(album);
        r2.setFigurinhas(figurinhasDemaisRemessas);
        System.out.println("Remessa - " + r2);
        RemessaController.incluir(r2);

        Remessa r3 = new Remessa(album);
        r3.setFigurinhas(figurinhasDemaisRemessas);
        System.out.println("Remessa - " + r3);
        RemessaController.incluir(r3);
    }
}
