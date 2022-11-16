package br.edu.infnet.appalbumcopa.model.service;

import br.edu.infnet.appalbumcopa.clients.IEnderecoClient;
import br.edu.infnet.appalbumcopa.clients.IUsuarioClient;
import br.edu.infnet.appalbumcopa.model.domain.Endereco;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    @Autowired
    private IEnderecoClient enderecoClient;
    @Autowired
    private IUsuarioClient usuarioClient;

    public void incluir(Usuario usuario) {
        usuarioClient.incluir(usuario);
    }

    public void excluir(Integer id) {
        usuarioClient.excluir(id);
    }

    public Collection<Usuario> obterLista() {
        return (Collection<Usuario>) usuarioClient.obterLista();
    }

    public Usuario validar(String email, String senha) {

        return usuarioClient.validar(email, senha);
    }

    public Endereco obterCep(String cep) {
        return enderecoClient.obterCep(cep);
    }
}
