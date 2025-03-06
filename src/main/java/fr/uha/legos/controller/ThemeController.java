package fr.uha.legos.controller;

import fr.uha.legos.model.Collection;
import fr.uha.legos.repository.CollectionRepository;
import fr.uha.legos.repository.CollectionneurRepository;
import fr.uha.legos.service.CollectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ThemeController {

    private CollectionRepository collectionRepository;
    private CollectionneurRepository collectionneurRepository;
    private CollectionService collectionService;

    public ThemeController(CollectionRepository collectionRepository, CollectionneurRepository collectionneurRepository, CollectionService collectionService) {
        this.collectionRepository = collectionRepository;
        this.collectionneurRepository = collectionneurRepository;
        this.collectionService = collectionService;
    }

    @GetMapping("/theme/{id}")
    public Optional<Collection> getThemeById(@PathVariable("id") int id) {
        return collectionRepository.findById(id);
    }

    @GetMapping("/theme/nom/{nom}")
    public List<Collection> getThemeByNom(@PathVariable("nom") String nom) {
        return collectionService.findByNom(nom);
    }

    @PostMapping("/theme")
    public void ajouterTheme(@RequestBody Collection collection) {
        collectionRepository.save(collection);
    }

    @PatchMapping("theme/{id}")
    public void modifierTheme(@PathVariable("id") int id, @RequestBody Collection collection) {
        collectionRepository.save(collection);
    }

    @DeleteMapping("/theme/{id}")
    public void supprimerTheme(@PathVariable("id") int id) {
        collectionRepository.deleteById(id);
    }
}
