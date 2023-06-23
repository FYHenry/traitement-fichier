package fr.diginamic.bo;

import jakarta.persistence.*;
/** Film */
@Entity
@Table(name = "Film")
public class Film {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /** Nom */
    @Column(name = "nom")
    private String nom;
    /** URL */
    @Column(name = "url")
    private String url;
    /** Description */
    @Column(name = "plot")
    private String plot;
    /** Lieu du tournage */
    @Column(name = "lieu_tournage")
    private String lieuTournage;
    /** Année de sortie */
    @Column(name = "annee_sortie")
    private int anneeSortie;
    /** Construction du film. */
    public Film(){}

    /** Construction du film avec ses paramètres.
     *
     * @param nom Nom
     * @param url URL
     * @param plot Description
     * @param lieuTournage Lieu du tournage
     * @param anneeSortie Année de sortie
     */
    public Film(String nom,
                String url,
                String plot,
                String lieuTournage,
                int anneeSortie) {
        this.nom = nom;
        this.url = url;
        this.plot = plot;
        this.lieuTournage = lieuTournage;
        this.anneeSortie = anneeSortie;
    }
}
