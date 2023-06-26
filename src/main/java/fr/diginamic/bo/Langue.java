package fr.diginamic.bo;

import jakarta.persistence.*;

/** Langue */
@Entity
@Table(name = "Langue")
public class Langue implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /** Nom */
    @Column(name = "nom")
    private String nom;
    /** Code */
    @Column(name = "code")
    private String code;
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
