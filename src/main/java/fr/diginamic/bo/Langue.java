package fr.diginamic.bo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Langue */
@Entity
@Table(name = "Langue")
public class Langue implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_langue")
    private int id;
    /** Nom */
    @Column(name = "nom")
    private String nom;
    /** Code */
    @Column(name = "code")
    private String code;
    /** Films */
    @OneToMany(mappedBy = "langue")
    private List<Film> films = new ArrayList<>();
    /** Construction. */
    public Langue() {
    }

    /** Construction avec paramètres.
     *
     * @param nom Nom
     * @param code Code
     */
    public Langue(String nom, String code) {
        this.nom = nom;
        this.code = code;
    }
}
