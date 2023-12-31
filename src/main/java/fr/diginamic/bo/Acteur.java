package fr.diginamic.bo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/** Acteur */
@Entity
@Table(name = "Acteur")
public class Acteur implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acteur")
    private int id;
    /** URL */
    @Column(name = "url")
    private String url;
    /** Naissance */
    @Embedded
    private Naissance naissance;
    /** Rôles */
    @ManyToMany(mappedBy = "acteurs")
    private List<Role> roles = new ArrayList<>();
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
