package fr.uha.legos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Collectionneur {

    @Id
    @GeneratedValue
    private int id;

    private String nom;
    private String ville;
    private String specialite;
    private int sets;

    public Collectionneur() {}
    public Collectionneur(String nom, String ville, String specialite, int sets) {
        this.nom = nom;
        this.ville = ville;
        this.specialite = specialite;
        this.sets = sets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }
}
