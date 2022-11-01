package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class CampeaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Campeao c1 = new Campeao();
        c1.selecao = "Brasil";
        c1.Ano = "1958";
        c1.resultadoPartida = "5x2";
        System.out.println("Campeao - " + c1);

        Campeao c2 = new Campeao();
        c2.selecao = "Brasil";
        c2.Ano = "1970";
        c2.resultadoPartida = "4x1";
        System.out.println("Campeao - " + c2);

        Campeao c3 = new Campeao();
        c3.selecao = "Brasil";
        c3.Ano = "2002";
        c3.resultadoPartida = "2x0";
        System.out.println("Campeao - " + c3);
    }
}
