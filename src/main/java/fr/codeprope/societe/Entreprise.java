package fr.codeprope.societe;

import java.util.Date;

/**
 * Représente une entreprise.
 */
public class Entreprise {

    public static final int CAPITAL_MAX = 3000000;
    private int siret;
    private String nom;
    private String adresse;
    private Date dateCreation;

    /**
     * Constructeur by default.
     */
    public Entreprise() {
    }

    /**
     * Constructeur with params.
     *
     * @param siret        numéro SIRET
     * @param nom          nom
     * @param adresse      adresse
     * @param dateCreation date de création
     */
    public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
        this.siret = siret;
        this.nom = nom;
        this.adresse = adresse;
        this.dateCreation = dateCreation;
    }

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        // Implémentez la logique pour afficher le statut
    }

    /**
     * Getters and Setters
     */

    public int getSiret() {
        return siret;
    }

    public void setSiret(int siret) {
        this.siret = siret;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "siret=" + siret +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
