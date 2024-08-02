package fr.codeprope.zoogestion;

/**
 * Représente un zoo avec différentes zones pour différents types d'animaux.
 */
public class Zoo {

    private String nom;

    /**
     * Zone dédiée aux animaux de la savane africaine.
     */
    private final SavaneAfricaine savaneAfricaine = new SavaneAfricaine();

    /**
     * Zone dédiée aux animaux carnivores.
     */
    private final ZoneCarnivore zoneCarnivore = new ZoneCarnivore();

    /**
     * Zone dédiée aux reptiles.
     */
    private final FermeReptile fermeReptile = new FermeReptile();

    /**
     * Zone dédiée aux poissons.
     */
    private final Aquarium aquarium = new Aquarium();

    /**
     * Constructeur pour initialiser un zoo avec un nom.
     *
     * @param nom le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
    }

    /**
     * Ajoute un animal à la zone appropriée en fonction de son type et de son comportement.
     *
     * @param nomAnimal le nom de l'animal
     * @param typeAnimal le type de l'animal (par exemple, "MAMMIFERE", "REPTILE", "POISSON")
     * @param comportement le comportement alimentaire de l'animal (par exemple, OMNIVORE, HERBIVORE, CARNIVORE)
     */
    public void addAnimal(String nomAnimal, String typeAnimal, TypeComportement comportement) {
        Animal animal = new Animal(typeAnimal, nomAnimal, comportement);

        switch (typeAnimal) {
            case "MAMMIFERE":
                if (comportement == TypeComportement.CARNIVORE) {
                    zoneCarnivore.addAnimal(animal);
                } else if (comportement == TypeComportement.HERBIVORE) {
                    savaneAfricaine.addAnimal(animal);
                }
                break;
            case "REPTILE":
                fermeReptile.addAnimal(animal);
                break;
            case "POISSON":
                aquarium.addAnimal(animal);
                break;
            default:
                System.out.println("Type d'animal inconnu : " + typeAnimal);
        }
    }

    /**
     * Affiche la liste des animaux présents dans toutes les zones du zoo.
     */
    public void afficherListeAnimaux() {
        savaneAfricaine.afficherListeAnimaux();
        zoneCarnivore.afficherListeAnimaux();
        fermeReptile.afficherListeAnimaux();
        aquarium.afficherListeAnimaux();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }
}
