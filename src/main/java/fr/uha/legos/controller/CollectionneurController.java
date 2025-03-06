package fr.uha.legos.controller;

import fr.uha.legos.model.Collectionneur;
import fr.uha.legos.repository.CollectionneurRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollectionneurController {

    private CollectionneurRepository collectionneurRepository;

    public CollectionneurController(CollectionneurRepository collectionneurRepository) {
        this.collectionneurRepository = collectionneurRepository;
    }

    @GetMapping("/collectionneur")
    public List<Collectionneur> getCollectionneur() {
        return collectionneurRepository.findAll();
    }
}
