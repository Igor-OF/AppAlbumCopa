package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE USUARIOS ##");

        Usuario u1 = new Usuario();
        u1.setNome("Igor");
        u1.setEmail("igor.mgof@gmail.com");
        u1.setSenha("12345");
        System.out.println("Usuario - " + u1);
        usuarioService.incluir(u1);
    }
}
