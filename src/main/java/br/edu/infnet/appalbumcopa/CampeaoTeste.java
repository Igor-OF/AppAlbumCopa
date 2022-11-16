package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import br.edu.infnet.appalbumcopa.model.service.CampeaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Order(5)
@Component
public class CampeaoTeste implements ApplicationRunner {

    @Autowired
    private CampeaoService campeaoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE CAMPEOES ##");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Campeao c1 = new Campeao();
        c1.setCodigo("FWC23");
        c1.setTipo(Tipo.COMUM);
        c1.setPartida("Brasil 5x2 Suécia");
        c1.setData(LocalDate.of(1958, 6, 29));
        c1.setUsuario(usuario);
        System.out.println("Campeao - " + c1);
        campeaoService.incluir(c1);

        Campeao c2 = new Campeao();
        c2.setCodigo("FWC24");
        c2.setTipo(Tipo.COMUM);
        c2.setPartida("Brasil 4x1 Itália");
        c2.setData(LocalDate.of(1970, 6, 21));
        c2.setUsuario(usuario);
        System.out.println("Campeao - " + c2);
        campeaoService.incluir(c2);

        Campeao c3 = new Campeao();
        c3.setCodigo("FWC25");
        c3.setTipo(Tipo.COMUM);
        c3.setPartida("Brasil 2x0 Alemanha");
        c3.setData(LocalDate.of(2002, 6, 30));
        c3.setUsuario(usuario);
        System.out.println("Campeao - " + c3);
        campeaoService.incluir(c3);
    }
}
