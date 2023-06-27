package fr.diginamic.bo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/** Pays */
@Entity
@Table(name = "Pays")
public class Pays implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pays")
    private int id;
    /** Nom */
    @Column(name = "nom")
    private String nom;
    /** URL */
    @Column(name = "url")
    private String url;
    /** Films */
    @OneToMany(mappedBy = "pays")
    private List<Film> films = new ArrayList<>();
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
