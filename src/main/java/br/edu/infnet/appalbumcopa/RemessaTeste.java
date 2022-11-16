package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.*;
import br.edu.infnet.appalbumcopa.model.service.RemessaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Order(7)
@Component
public class RemessaTeste implements ApplicationRunner {

    @Autowired
    private RemessaService remessaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE REMESSAS ##");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Jogador jogador = new Jogador();
        jogador.setId(1);

        Estadio estadio = new Estadio();
        estadio.setId(1);

        Campeao campeao = new Campeao();
        campeao.setId(1);

        Album album = new Album();
        album.setId(1);

        List<Figurinha> figurinhasPrimeiraRemessa = new ArrayList<>();
        figurinhasPrimeiraRemessa.add(jogador);

        List<Figurinha> figurinhasDemaisRemessas = new ArrayList<>();
        figurinhasDemaisRemessas.add(estadio);
        figurinhasDemaisRemessas.add(campeao);

        Remessa r1 = new Remessa();
        r1.setAlbum(album);
        r1.setFigurinhas(figurinhasPrimeiraRemessa);
        r1.setUsuario(usuario);
        System.out.println("Remessa - " + r1);
        remessaService.incluir(r1);

        Remessa r2 = new Remessa();
        r2.setAlbum(album);
        r2.setFigurinhas(figurinhasDemaisRemessas);
        r2.setUsuario(usuario);
        System.out.println("Remessa - " + r2);
        remessaService.incluir(r2);

        Remessa r3 = new Remessa(album);
        r3.setFigurinhas(figurinhasDemaisRemessas);
        r3.setUsuario(usuario);
        System.out.println("Remessa - " + r3);
        remessaService.incluir(r3);
    }
}
