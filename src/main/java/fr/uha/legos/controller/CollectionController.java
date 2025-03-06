package fr.uha.legos.controller;

import fr.uha.legos.model.Collection;
import fr.uha.legos.repository.CollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollectionController {

    private final CollectionRepository collectionRepository;

    public CollectionController(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @GetMapping("/collection")
    public List<Collection> getCollection() {
        return collectionRepository.findAll();
    }
}
