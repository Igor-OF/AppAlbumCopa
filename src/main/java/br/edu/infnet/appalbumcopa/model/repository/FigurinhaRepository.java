package br.edu.infnet.appalbumcopa.model.repository;

import br.edu.infnet.appalbumcopa.model.domain.Figurinha;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FigurinhaRepository extends CrudRepository<Figurinha, Integer> {

    @Query("from Figurinha f where f.usuario.id =:userid")
    List<Figurinha> obterLista(Integer userid);
}
