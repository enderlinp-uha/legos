package fr.uha.legos.controller;

import fr.uha.legos.repository.CollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableauController {
    private CollectionRepository collectionRepository;

    public TableauController(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @GetMapping("/tableau/{id}")
    public List<String> getTableauById(@PathVariable int id) {
        return collectionRepository.findById(id).get().getSets();
    }
}
