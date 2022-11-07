package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CampeaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Campeao c1 = new Campeao();
        c1.partida = "Brasil 5x2 Suécia";
        c1.data = LocalDate.of(1958, 6, 29);
        System.out.println("Campeao - " + c1);

        Campeao c2 = new Campeao();
        c2.partida = "Brasil 4x1 Itália";
        c2.data = LocalDate.of(1970, 6, 21);
        System.out.println("Campeao - " + c2);

        Campeao c3 = new Campeao();
        c3.partida = "Brasil 2x0 Alemanha";
        c3.data = LocalDate.of(2002, 6, 30);
        System.out.println("Campeao - " + c3);
    }
}
