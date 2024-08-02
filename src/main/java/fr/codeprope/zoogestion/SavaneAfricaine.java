package fr.codeprope.zoogestion;

/**
 * Représente une zone spécifique du zoo dédiée aux animaux de la savane africaine.
 */
public class SavaneAfricaine extends Zone {

    /**
     * Calcule le nombre de kilogrammes de nourriture/jour pour les animaux de la savane africaine.
     * @return le nombre de kilogrammes de nourriture nécessaire par jour
     */
    @Override
    public double calculerKgsNourritureParJour() {
        return animaux.size() * 10;
    }
}
