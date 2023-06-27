package fr.diginamic.bo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/** Film */
@Entity
@Table(name = "Film")
public class Film implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_film")
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
    /** Réalisateurs */
    @ManyToMany
    @JoinTable(name = "Realiser",
            joinColumns = {@JoinColumn(name = "id_realisateur_a")},
            inverseJoinColumns = {@JoinColumn(name = "id_film_est")})
    private List<Realisateur> realisateurs = new ArrayList<>();
    /** Casting principal */
    @ManyToMany
    @JoinTable(name = "Necessiter",
            joinColumns = {@JoinColumn(name = "id_casting_principal_est")},
            inverseJoinColumns = {@JoinColumn(name = "id_film_a")})
    private List<CastingPrincipal> castingPrincipals = new ArrayList<>();
    /** Pays */
    @ManyToOne
    @JoinColumn(name = "id_pays")
    private Pays pays;
    /** Langue */
    @ManyToOne
    @JoinColumn(name = "id_langue")
    private Langue langue;
    /** Rôles */
    @ManyToMany
    @JoinTable(name = "Comprendre",
            joinColumns = {@JoinColumn(name = "id_film_a")},
            inverseJoinColumns = {@JoinColumn(name = "id_role_est")})
    private List<Role> roles = new ArrayList<>();
    /** Genres */
    @ManyToMany
    @JoinTable(name = "Classer",
            joinColumns = {@JoinColumn(name = "id_film_est")},
            inverseJoinColumns = {@JoinColumn(name = "id_genre_a")})
    private List<Genre> genres = new ArrayList<>();
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
                int anneeSortie,
                Pays pays,
                Langue langue) {
        this.nom = nom;
        this.url = url;
        this.plot = plot;
        this.lieuTournage = lieuTournage;
        this.anneeSortie = anneeSortie;
        this.pays = pays;
        this.langue = langue;
    }
}
