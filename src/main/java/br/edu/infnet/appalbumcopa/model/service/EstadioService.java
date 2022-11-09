package br.edu.infnet.appalbumcopa.model.service;

import br.edu.infnet.appalbumcopa.model.domain.Estadio;
import br.edu.infnet.appalbumcopa.model.repository.EstadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EstadioService {

    @Autowired
    private EstadioRepository estadioRepository;

    public void incluir(Estadio estadio) {
        estadioRepository.save(estadio);
    }

    public void excluir(Integer id) {
        estadioRepository.deleteById(id);
    }

    public Collection<Estadio> obterLista() {
        return (Collection<Estadio>) estadioRepository.findAll();
    }
}
