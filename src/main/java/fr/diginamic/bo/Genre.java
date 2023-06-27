package fr.diginamic.bo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/** Genre */
@Entity
@Table(name = "Genre")
public class Genre implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genre")
    private int id;
    /** Nom */
    @Column(name = "nom")
    private String nom;
    /** Films */
    @ManyToMany(mappedBy = "genres")
    private List<Film> films = new ArrayList<>();
    /** Construction. */
    public Genre() {
    }

    /** Construction avec paramètres.
     *
     * @param nom Nom
     */
    public Genre(String nom) {
        this.nom = nom;
    }
}
