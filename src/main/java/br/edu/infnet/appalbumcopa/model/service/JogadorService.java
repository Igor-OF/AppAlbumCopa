package br.edu.infnet.appalbumcopa.model.service;

import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import br.edu.infnet.appalbumcopa.model.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public void incluir(Jogador jogador) {
        jogadorRepository.save(jogador);
    }

    public void excluir(Integer id) {
        jogadorRepository.deleteById(id);
    }

    public Collection<Jogador> obterLista() {
        return (Collection<Jogador>) jogadorRepository.findAll();
    }
}
