package fr.uha.legos;

import fr.uha.legos.model.Collection;
import fr.uha.legos.model.Collectionneur;
import fr.uha.legos.repository.CollectionRepository;
import fr.uha.legos.repository.CollectionneurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class LegosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegosApplication.class, args);
	}

    @Bean
    CommandLineRunner initRepositories(CollectionneurRepository collectionneurRepository, CollectionRepository collectionRepository) {
        return args -> {
            System.out.println("\n----------- Initialisation du projet ----------\n");

            System.out.println("\nAjout de collectionneurs");
            List<Collectionneur> data = new ArrayList<>();

            Collectionneur collectionneur = new Collectionneur();
            collectionneur.setNom("Thimothée");
            collectionneur.setVille("Strasbourg");
            collectionneur.setSpecialite("Bionicle");
            collectionneur.setSets(2400);
            data.add(collectionneur);

            Collectionneur collectionneur2 = new Collectionneur();
            collectionneur2.setNom("Didier");
            collectionneur2.setVille("Nancy");
            collectionneur2.setSpecialite("MOCS");
            collectionneur2.setSets(3000);
            data.add(collectionneur2);

            Collectionneur collectionneur3 = new Collectionneur();
            collectionneur3.setNom("Marie");
            collectionneur3.setVille("Paris");
            collectionneur3.setSpecialite("City");
            collectionneur3.setSets(1500);
            data.add(collectionneur3);

            Collectionneur collectionneur4 = new Collectionneur();
            collectionneur4.setNom("Jean");
            collectionneur4.setVille("Lyon");
            collectionneur4.setSpecialite("Star wars");
            collectionneur4.setSets(200);
            data.add(collectionneur4);

            Collectionneur collectionneur5 = new Collectionneur();
            collectionneur5.setNom("Lucie");
            collectionneur5.setVille("Marseille");
            collectionneur5.setSpecialite("Friends");
            collectionneur5.setSets(1);
            data.add(collectionneur5);

            collectionneurRepository.saveAll(data);

            System.out.println("\nAjout de collections");
            List<Collection> data2 = new ArrayList<>();

            Collection collection = new Collection();
            collection.setNom("Bionicles forever");
            collection.setNombre_scenes(40);
            collection.setNombre_pieces(2000);
            collection.setNombre_minifigs(130);
            collection.setCollectionneur(collectionneur);
            collection.setImage("https://fr.wikipedia.org/wiki/Bionicle#/media/Fichier:BIONICLE_Exo-Toa.jpg");
            collection.setDescription("Les Bionicle sont des personnages de l'univers Lego. Ils sont composés de pièces de différentes couleurs et formes. Ils sont articulés et souvent mis en scène dans des décors de guerre.");

            List<String> sets = new ArrayList<>();
            sets.add("Rahkshi");
            sets.add("Takanuva");
            sets.add("Kopaka");
            sets.add("(8535)");

            collection.setSets(sets);
            data2.add(collection);

            Collection collection2 = new Collection();
            collection2.setNom("Guerre fratricide");
            collection2.setNombre_scenes(5);
            collection2.setNombre_pieces(200);
            collection2.setNombre_minifigs(0);
            collection2.setCollectionneur(collectionneur);
            collection2.setImage("https://fr.wikipedia.org/wiki/Bionicle#/media/Fichier:BIONICLE_Exo-Toa.jpg");
            collection2.setDescription("5 Bionicles identiques se déchirent dans une guerre terrible.");

            List<String> sets2 = new ArrayList<>();
            sets2.add("(8532)");

            collection2.setSets(sets2);
            data2.add(collection2);

            Collection collection3 = new Collection();
            collection3.setNom("Le monde des MOCs");
            collection3.setNombre_scenes(10);
            collection3.setNombre_pieces(1000);
            collection3.setNombre_minifigs(0);
            collection3.setCollectionneur(collectionneur2);
            collection3.setImage("https://fr.wikipedia.org/wiki/Lego#/media/Fichier:14-05-28-LEGO-by-RalfR-081.jpg");
            collection3.setDescription("Les MOCs sont des créations personnelles de fans de Lego. Ils sont souvent mis en scène dans des décors de guerre.");

            List<String> sets3 = new ArrayList<>();
            sets3.add("(MOC1)");
            sets3.add("(MOC2)");
            sets3.add("(MOC3)");
            sets3.add("(MOC4)");
            sets3.add("MOC sans nom");

            collection3.setSets(sets3);
            data2.add(collection3);

            collectionRepository.saveAll(data2);

            System.out.println("\n\n---------- FIN ----------");
        };
    }

}
