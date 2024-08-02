package fr.codeprope.banque;

/**
 * Représente un compte bancaire de base
 *
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

    /**
     * solde : solde du compte
     */
    protected double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du solde
     *
     * @param montant
     */
    public abstract void debiterMontant(double montant);

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter for solde
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "solde=" + solde +
                '}';
    }
}
