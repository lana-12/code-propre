package fr.codeprope.zoogestion;

/**
 * Classe principale de l'application pour exécuter des opérations sur le zoo.
 */
public class ZooApplication {

    /**
     * Point d'entrée de l'application.
     *
     * @param args les arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {
        // Création d'une instance de Zoo
        Zoo zoo = new Zoo("Lunaret");

        // Ajout des animaux au zoo avec leurs types et comportements
        zoo.addAnimal("Ours", "MAMMIFERE", TypeComportement.OMNIVORE);
        zoo.addAnimal("Cochon", "MAMMIFERE", TypeComportement.OMNIVORE);
        zoo.addAnimal("Rat", "MAMMIFERE", TypeComportement.OMNIVORE);
        zoo.addAnimal("Chien", "MAMMIFERE", TypeComportement.OMNIVORE);
        zoo.addAnimal("Écureuil", "MAMMIFERE", TypeComportement.OMNIVORE);
        zoo.addAnimal("Tortue", "REPTILE", TypeComportement.OMNIVORE);
        zoo.addAnimal("Serpent corail", "REPTILE", TypeComportement.CARNIVORE);
        zoo.addAnimal("Iguane", "REPTILE", TypeComportement.HERBIVORE);
        zoo.addAnimal("Perche", "POISSON", TypeComportement.OMNIVORE);
        zoo.addAnimal("Carpe", "POISSON", TypeComportement.HERBIVORE);
        zoo.addAnimal("Gazelle", "MAMMIFERE", TypeComportement.HERBIVORE);
        zoo.addAnimal("Zèbre", "MAMMIFERE", TypeComportement.HERBIVORE);
        zoo.addAnimal("Lion", "MAMMIFERE", TypeComportement.CARNIVORE);
        zoo.addAnimal("Panthère", "MAMMIFERE", TypeComportement.CARNIVORE);
        zoo.addAnimal("Requin blanc", "POISSON", TypeComportement.CARNIVORE);
        zoo.addAnimal("Truite dorée", "POISSON", TypeComportement.HERBIVORE);
        zoo.addAnimal("Boa constrictor", "REPTILE", TypeComportement.CARNIVORE);
        zoo.addAnimal("Python", "REPTILE", TypeComportement.CARNIVORE);

        // Affichage de la liste des animaux présents dans le zoo
        zoo.afficherListeAnimaux();
    }
}
