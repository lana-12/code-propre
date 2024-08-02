package fr.codeprope.zoogestion;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une zone dans le zoo
 */
public abstract class Zone {

    /**
     * Liste des animaux.
     */
    protected List<Animal> animaux = new ArrayList<>();

    /**
     * Ajoute un animal à la liste des animaux
     *
     * @param animal l'animal à ajouter
     */
    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche liste des animaux.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Compte le nombre d'animaux.
     *
     * @return le nombre d'animaux
     */
    public int compterAnimaux() {
        return animaux.size();
    }

    /**
     * Calcule le nombre de kilogrammes de nourriture/jour pour les animaux de la zone.
     *
     * @return le nombre de kilogrammes de nourriture nécessaire par jour
     */
    public abstract double calculerKgsNourritureParJour();
}
