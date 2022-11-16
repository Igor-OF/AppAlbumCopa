package br.edu.infnet.appalbumcopa.model.repository;

import br.edu.infnet.appalbumcopa.model.domain.Remessa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RemessaRepository extends CrudRepository<Remessa, Integer> {

    @Query("from Remessa r where r.usuario.id =:userid")
    List<Remessa> obterLista(Integer userid);
}
