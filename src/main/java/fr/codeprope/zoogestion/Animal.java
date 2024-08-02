package fr.codeprope.zoogestion;


/**
 * Représente un animal dans le zoo.
 */
public class Animal {


    private final String type;

    private final String nom;


    private final TypeComportement comportement;

    /**
     * Constructeur de la classe Animal.
     *
     * @param type le type de l'animal (ex : MAMMIFERE, REPTILE, etc.)
     * @param nom le nom de l'animal
     * @param comportement le comportement de l'animal (HERBIVORE, CARNIVORE, OMNIVORE)
     */
    public Animal(String type, String nom, TypeComportement comportement) {
        this.type = type;
        this.nom = nom;
        this.comportement = comportement;
    }

    /**
     * Generate SETTERS and GETTERS
     */

    public String getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    /**
     * Retourne le comportement de l'animal.
     *
     * @return le comportement de l'animal
     */
    public TypeComportement getComportement() {
        return comportement;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'animal.
     *
     * @return une chaîne de caractères représentant l'animal
     */
    @Override
    public String toString() {
        return nom + " (" + type + ", " + comportement + ")";
    }
}