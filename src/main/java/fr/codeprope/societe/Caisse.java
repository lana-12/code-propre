package fr.codeprope.societe;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une caisse pour stocker des items.
 */
public class Caisse {

    private String nom;
    private List<Item> items;

    /**
     * Constructeur by default.
     *
     * @param nom le nom de la caisse
     */
    public Caisse(String nom) {
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /***
     * Generate Getters and Setters
     */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Ajoute un item à la caisse si elle peut l'accepter.
     *
     * @param item l'item à ajouter
     * @return true si l'item a été ajouté, false sinon
     */
    public boolean addItem(Item item) {
        // Implémentez la logique pour déterminer si l'item peut être ajouté
        // Par exemple, selon la taille ou d'autres critères spécifiques
        this.items.add(item);
        return true; // Retournez false si l'item ne peut pas être ajouté
    }
}
