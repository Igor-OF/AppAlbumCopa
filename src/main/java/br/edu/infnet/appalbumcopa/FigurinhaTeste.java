package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import br.edu.infnet.appalbumcopa.model.service.FigurinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class FigurinhaTeste implements ApplicationRunner {

    @Autowired
    private FigurinhaService figurinhaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE FIGURINHAS ##");

        Jogador j1 = new Jogador();
        j1.setCodigo("BRA17");
        j1.setTipo(Tipo.OURO);
        j1.setNome("Neymar");
        j1.setSelecao(Selecao.BRASIL);
        j1.setPosicao(Posicao.ATACANTE);
        System.out.println("Jogador - " + j1);
        figurinhaService.incluir(j1);

        Estadio e1 = new Estadio();
        e1.setCodigo("FWC01");
        e1.setTipo(Tipo.COMUM);
        e1.setNome("Al Bayt");
        e1.setCidade("Al Khor");
        e1.setCapacidade(60000);
        System.out.println("Estadio - " + e1);
        figurinhaService.incluir(e1);

        Campeao c1 = new Campeao();
        c1.setCodigo("FWC23");
        c1.setTipo(Tipo.COMUM);
        c1.setPartida("Brasil 5x2 Suécia");
        c1.setData(LocalDate.of(1958, 6, 29));
        System.out.println("Campeao - " + c1);
        figurinhaService.incluir(c1);
    }
}
