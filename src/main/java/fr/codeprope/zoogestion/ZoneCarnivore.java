package fr.codeprope.zoogestion;

/**
 * Représente une zone du zoo dédiée aux animaux carnivores.
 */
public class ZoneCarnivore extends Zone {

    /**
     * Calcule le nombre de kilogrammes de nourriture/jour pour les animaux carnivores de la zone.
     * @return le nombre de kilogrammes de nourriture nécessaire par jour
     */
    @Override
    public double calculerKgsNourritureParJour() {
        return animaux.size() * 10;
    }
}
