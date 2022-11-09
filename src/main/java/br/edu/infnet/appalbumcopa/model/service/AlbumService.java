package br.edu.infnet.appalbumcopa.model.service;

import br.edu.infnet.appalbumcopa.model.domain.Album;
import br.edu.infnet.appalbumcopa.model.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public void incluir(Album album) {
        albumRepository.save(album);
    }

    public void excluir(Integer id) {
        albumRepository.deleteById(id);
    }

    public Collection<Album> obterLista() {
        return (Collection<Album>) albumRepository.findAll();
    }
}
