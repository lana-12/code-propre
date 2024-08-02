package fr.codeprope.societe;

/**
 * Représente un item avec un nom et un poids.
 */
public class Item {

    private String nom;
    private double poids;

    /**
     * Constructeur by default.
     */
    public Item() {
    }

    /**
     * Constructeur with params.
     *
     * @param nom   le nom de l'item
     * @param poids le poids de l'item
     */
    public Item(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nom='" + nom + '\'' +
                ", poids=" + poids +
                '}';
    }
}
