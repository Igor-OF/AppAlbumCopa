package br.edu.infnet.appalbumcopa;

import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.domain.enums.Posicao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Selecao;
import br.edu.infnet.appalbumcopa.model.domain.enums.Tipo;
import br.edu.infnet.appalbumcopa.model.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(5)
@Component
public class JogadorTeste implements ApplicationRunner {

    @Autowired
    private JogadorService jogadorService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("## CADASTRAMENTO DE JOGADORES ##");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Jogador j1 = new Jogador();
        j1.setCodigo("BRA17");
        j1.setTipo(Tipo.OURO);
        j1.setNome("Neymar");
        j1.setSelecao(Selecao.BRASIL);
        j1.setPosicao(Posicao.ATACANTE);
        j1.setUsuario(usuario);
        System.out.println("Jogador - " + j1);
        jogadorService.incluir(j1);

        Jogador j2 = new Jogador();
        j2.setCodigo("ARG20");
        j2.setTipo(Tipo.PRATA);
        j2.setNome("Messi");
        j2.setSelecao(Selecao.ARGENTINA);
        j2.setPosicao(Posicao.ATACANTE);
        j2.setUsuario(usuario);
        System.out.println("Jogador - " + j2);
        jogadorService.incluir(j2);

        Jogador j3 = new Jogador();
        j3.setCodigo("POR19");
        j3.setTipo(Tipo.BRONZE);
        j3.setNome("Cristiano Ronaldo");
        j3.setSelecao(Selecao.PORTUGAL);
        j3.setPosicao(Posicao.ATACANTE);
        j3.setUsuario(usuario);
        System.out.println("Jogador - " + j3);
        jogadorService.incluir(j3);
    }
}
