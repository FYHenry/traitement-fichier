package fr.diginamic.bo;

import jakarta.persistence.*;

/** Genre */
@Entity
@Table(name = "Genre")
public class Genre implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /** Nom */
    @Column(name = "nom")
    private String nom;
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
