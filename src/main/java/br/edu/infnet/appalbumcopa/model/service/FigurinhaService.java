package br.edu.infnet.appalbumcopa.model.service;

import br.edu.infnet.appalbumcopa.model.domain.Figurinha;
import br.edu.infnet.appalbumcopa.model.repository.FigurinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FigurinhaService {

    @Autowired
    private FigurinhaRepository figurinhaRepository;

    public void incluir(Figurinha figurinha) {
        figurinhaRepository.save(figurinha);
    }

    public void excluir(Integer id) {
        figurinhaRepository.deleteById(id);
    }

    public Collection<Figurinha> obterLista() {
        return (Collection<Figurinha>) figurinhaRepository.findAll();
    }
}
