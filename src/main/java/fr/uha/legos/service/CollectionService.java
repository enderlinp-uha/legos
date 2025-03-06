package fr.uha.legos.service;

import fr.uha.legos.model.Collection;
import fr.uha.legos.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

    @Autowired
    private CollectionRepository collectionRepository;

    public List<Collection> findByNom(String nom) {
        return collectionRepository.findByNom(nom);
    }
}
