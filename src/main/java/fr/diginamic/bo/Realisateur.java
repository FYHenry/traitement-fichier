package fr.diginamic.bo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/** Réalisateur */
@Entity
@Table(name = "Realisateur")
public class Realisateur implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_realisateur")
    private int id;
    /** Identité */
    @Column(name = "identite")
    private String identite;
    /** URL */
    @Column(name = "url")
    private String url;
    /** Films */
    @ManyToMany(mappedBy = "realisateurs")
    private List<Film> films = new ArrayList<>();
    /** Construction. */
    public Realisateur() {
    }

    /** Construction avec paramètres.
     *
     * @param identite Identité
     * @param url URL
     */
    public Realisateur(String identite, String url) {
        this.identite = identite;
        this.url = url;
    }
}
