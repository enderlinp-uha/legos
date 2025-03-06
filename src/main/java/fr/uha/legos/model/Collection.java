package fr.uha.legos.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Collection {

    @Id
    @GeneratedValue
    private int id;

    private String nom;
    private int nombre_scenes;
    private int nombre_pieces;
    private int nombre_minifigs;

    @ManyToOne
    @JoinColumn(name = "collectionneur_id")
    private Collectionneur collectionneur;

    private String image;
    private String description;
    private List<String> sets = new ArrayList<>();

    public Collection() {}
    public Collection(String nom, int nombre_scenes, int nombre_pieces, int nombre_minifigs, Collectionneur collectionneur, String image, String description, List<String> sets) {
        this.nom = nom;
        this.nombre_scenes = nombre_scenes;
        this.nombre_pieces = nombre_pieces;
        this.nombre_minifigs = nombre_minifigs;
        this.collectionneur = collectionneur;
        this.image = image;
        this.description = description;
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

    public int getNombre_scenes() {
        return nombre_scenes;
    }

    public void setNombre_scenes(int nombre_scenes) {
        this.nombre_scenes = nombre_scenes;
    }

    public int getNombre_pieces() {
        return nombre_pieces;
    }

    public void setNombre_pieces(int nombre_pieces) {
        this.nombre_pieces = nombre_pieces;
    }

    public int getNombre_minifigs() {
        return nombre_minifigs;
    }

    public void setNombre_minifigs(int nombre_minifigs) {
        this.nombre_minifigs = nombre_minifigs;
    }

    public Collectionneur getCollectionneur() {
        return collectionneur;
    }

    public void setCollectionneur(Collectionneur collectionneur) {
        this.collectionneur = collectionneur;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSets() {
        return sets;
    }

    public void setSets(List<String> sets) {
        this.sets = sets;
    }
}
