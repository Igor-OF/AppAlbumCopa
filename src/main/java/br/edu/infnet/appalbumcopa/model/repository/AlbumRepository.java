package br.edu.infnet.appalbumcopa.model.repository;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer> {

    @Query("from Album a where a.usuario.id = :userid")
    List<Album> obterLista(Integer userid);
}
