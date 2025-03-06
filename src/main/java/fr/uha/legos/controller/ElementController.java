package fr.uha.legos.controller;

import fr.uha.legos.model.Collection;
import fr.uha.legos.repository.CollectionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ElementController {

    private final CollectionRepository collectionRepository;

    public ElementController(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @PatchMapping("/theme/{id}/{element}")
    public ResponseEntity<String> ajouterElement(@PathVariable("id") int id, @PathVariable("element") String element) {
        Optional<Collection> collectionOpt = collectionRepository.findById(id);

        if (collectionOpt.isPresent()) {
            Collection collection = collectionOpt.get();
            collection.getSets().add(element);
            collectionRepository.save(collection);
            return ResponseEntity.ok("Élément ajouté avec succès");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Collection non trouvée");
        }
    }
}
