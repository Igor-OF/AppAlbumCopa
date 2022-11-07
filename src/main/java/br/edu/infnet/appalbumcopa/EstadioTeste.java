package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EstadioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estadio e1 = new Estadio();
        e1.nome = "Al Bayt";
        e1.cidade = "Al Khor";
        e1.capacidade = 60000;
        System.out.println("Estadio - " + e1);

        Estadio e2 = new Estadio();
        e2.nome = "Ras Abu Aboud";
        e2.cidade = "Doha";
        e2.capacidade = 40000;
        System.out.println("Estadio - " + e2);

        Estadio e3 = new Estadio();
        e3.nome = "Al Thumama";
        e3.cidade = "Doha";
        e3.capacidade = 40000;
        System.out.println("Estadio - " + e3);
    }
}
