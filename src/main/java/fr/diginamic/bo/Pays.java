package fr.diginamic.bo;

import jakarta.persistence.*;

/** Pays */
@Entity
@Table(name = "Pays")
public class Pays implements Recordable {
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
    /** Construction. */
    public Pays() {
    }

    /** Construction avec paramètres.
     *
     * @param nom Nom
     * @param url URL
     */
    public Pays(String nom, String url) {
        this.nom = nom;
        this.url = url;
    }
}
