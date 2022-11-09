package br.edu.infnet.appalbumcopa.model.service;

import br.edu.infnet.appalbumcopa.model.domain.Campeao;
import br.edu.infnet.appalbumcopa.model.repository.CampeaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CampeaoService {

    @Autowired
    private CampeaoRepository campeaoRepository;

    public void incluir(Campeao campeao) {
        campeaoRepository.save(campeao);
    }

    public void excluir(Integer id) {
        campeaoRepository.deleteById(id);
    }

    public Collection<Campeao> obterLista() {
        return (Collection<Campeao>) campeaoRepository.findAll();
    }
}
