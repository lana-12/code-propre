package fr.codeprope.societe;

import java.util.ArrayList;
import java.util.List;

/**
 * Gère l'inventaire des caisses.
 */
public class Inventaire {

    private final List<Caisse> caisses;

    /**
     * Constructeur by default.
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    /**
     * Ajoute un item à l'inventaire.
     *
     * @param item l'item à ajouter
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.addItem(item)) {
                return;
            }
        }
    }

    /**
     * @return le nombre total d'items
     */
    public int taille() {
        int tailleTotale = 0;
        for (Caisse caisse : caisses) {
            tailleTotale += caisse.getItems().size();
        }
        return tailleTotale;
    }
}
