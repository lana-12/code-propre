package fr.codeprope.zoogestion;

/**
 * Représente une zone spécifique du zoo dédiée aux reptiles.
 */
public class FermeReptile extends Zone {

    /**
     * Calcule le nombre de kilogrammes de nourriture/ pour les animaux de la ferme reptile.
     *
     * @return le nombre de kilogrammes de nourriture nécessaire par jour
     */
    @Override
    public double calculerKgsNourritureParJour() {
        return animaux.size() * 0.1;
    }
}
