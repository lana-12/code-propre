package fr.codeprope.zoogestion;

/**
 * Représente une zone spécifique du zoo dédiée aux poissons et autres animaux aquatiques.
 */
public class Aquarium extends Zone {

    /**
     * Calcule le nombre de kilogrammes de nourriture/jour pour les animaux de l'aquarium.
     *
     * @return le nombre de kilogrammes de nourriture nécessaire par jour
     */
    @Override
    public double calculerKgsNourritureParJour() {
        return animaux.size() * 0.2;
    }
}
