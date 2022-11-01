package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class EstadioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estadio e1 = new Estadio();
        e1.nome = "Estadio 01";
        e1.cidade = "Catar";
        e1.capacidade = 60000;
        System.out.println("Estadio - " + e1);

        Estadio e2 = new Estadio();
        e2.nome = "Estadio 02";
        e2.cidade = "Catar";
        e2.capacidade = 50000;
        System.out.println("Estadio - " + e2);

        Estadio e3 = new Estadio();
        e3.nome = "Estadio 03";
        e3.cidade = "Catar";
        e3.capacidade = 40000;
        System.out.println("Estadio - " + e3);
    }
}
