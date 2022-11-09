package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.controller.CampeaoController;
import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CampeaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE CAMPEOES ##");

        Campeao c1 = new Campeao();
        c1.setCodigo("FWC23");
        c1.setTipo(Tipo.COMUM);
        c1.setPartida("Brasil 5x2 Suécia");
        c1.setData(LocalDate.of(1958, 6, 29));
        System.out.println("Campeao - " + c1);
        CampeaoController.incluir(c1);

        Campeao c2 = new Campeao();
        c2.setCodigo("FWC24");
        c2.setTipo(Tipo.COMUM);
        c2.setPartida("Brasil 4x1 Itália");
        c2.setData(LocalDate.of(1970, 6, 21));
        System.out.println("Campeao - " + c2);
        CampeaoController.incluir(c2);

        Campeao c3 = new Campeao();
        c3.setCodigo("FWC25");
        c3.setTipo(Tipo.COMUM);
        c3.setPartida("Brasil 2x0 Alemanha");
        c3.setData(LocalDate.of(2002, 6, 30));
        System.out.println("Campeao - " + c3);
        CampeaoController.incluir(c3);
    }
}
