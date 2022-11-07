package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Figurinha;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FigurinhaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Figurinha f1 = new Figurinha();
        f1.codigo = "BRA17";
        f1.tipo = Tipo.COMUM;
        System.out.println("Figurinha - " + f1);

        Figurinha f2 = new Figurinha();
        f2.codigo = "ARG12";
        f2.tipo = Tipo.OURO;
        System.out.println("Figurinha - " + f2);

        Figurinha f3 = new Figurinha();
        f3.codigo = "FRA01";
        f3.tipo = Tipo.BRONZE;
        System.out.println("Figurinha - " + f3);
    }
}
