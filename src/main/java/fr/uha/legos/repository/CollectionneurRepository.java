package fr.uha.legos.repository;

import fr.uha.legos.model.Collectionneur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionneurRepository extends JpaRepository<Collectionneur, Integer> {
}
