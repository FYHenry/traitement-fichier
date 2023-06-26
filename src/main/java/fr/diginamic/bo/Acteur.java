package fr.diginamic.bo;

import jakarta.persistence.*;

/** Acteur */
@Entity
@Table(name = "Acteur")
public class Acteur implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /** URL */
    @Column(name = "url")
    private String url;
    /** Construction. */
    public Acteur() {
    }

    /** Construction avec paramètres.
     *
     * @param url URL
     */
    public Acteur(String url) {
        this.url = url;
    }
}
