package br.edu.infnet.appalbumcopa.model.service;

import br.edu.infnet.appalbumcopa.model.domain.Remessa;
import br.edu.infnet.appalbumcopa.model.domain.Usuario;
import br.edu.infnet.appalbumcopa.model.repository.RemessaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RemessaService {

    @Autowired
    private RemessaRepository remessaRepository;

    public void incluir(Remessa remessa) {
        remessaRepository.save(remessa);
    }

    public void excluir(Integer id) {
        remessaRepository.deleteById(id);
    }

    public Collection<Remessa> obterLista(){
        return (Collection<Remessa>) remessaRepository.findAll();
    }

    public Collection<Remessa> obterLista(Usuario usuario){
        return (Collection<Remessa>) remessaRepository.obterLista(usuario.getId());
    }
}
