package fr.codeprope.banque;

/**
 * Représente un compte bancaire de type Livret A
 *
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= 0) {
            this.solde -= montant;
        }
    }

    public void appliquerRemuAnnuelle() {
        this.solde += this.solde * tauxRemuneration / 100;
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter for tauxRemuneration
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return "LivretA{" +
                "tauxRemuneration=" + tauxRemuneration +
                ", solde=" + solde +
                '}';
    }
}
