package br.edu.infnet.appalbumcopa.model.repository;

import br.edu.infnet.appalbumcopa.model.domain.Jogador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Integer> {
}
