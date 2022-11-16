package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import br.edu.infnet.appalbumcopa.model.service.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(6)
@Component
public class EstadioTeste implements ApplicationRunner {

    @Autowired
    private EstadioService estadioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE ESTADIOS ##");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Estadio e1 = new Estadio();
        e1.setCodigo("FWC01");
        e1.setTipo(Tipo.COMUM);
        e1.setNome("Al Bayt");
        e1.setCidade("Al Khor");
        e1.setCapacidade(60000);
        e1.setUsuario(usuario);
        System.out.println("Estadio - " + e1);
        estadioService.incluir(e1);

        Estadio e2 = new Estadio();
        e2.setCodigo("FWC02");
        e2.setTipo(Tipo.COMUM);
        e2.setNome("Ras Abu Aboud");
        e2.setCidade("Doha");
        e2.setCapacidade(40000);
        e2.setUsuario(usuario);
        System.out.println("Estadio - " + e2);
        estadioService.incluir(e2);

        Estadio e3 = new Estadio();
        e3.setCodigo("FWC03");
        e3.setTipo(Tipo.COMUM);
        e3.setNome("Al Thumama");
        e3.setCidade("Doha");
        e3.setCapacidade(40000);
        e3.setUsuario(usuario);
        System.out.println("Estadio - " + e3);
        estadioService.incluir(e3);
    }
}
