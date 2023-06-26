package fr.diginamic.bo;

import jakarta.persistence.*;

/** Rôle */
@Entity
@Table(name = "Role")
public class Role implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /** Nom du personage */
    @Column(name = "character_name")
    private String characterName;
    /** Construction. */
    public Role(){}

    /** Construction avec paramètres.
     *
     * @param characterName Nom du personage
     */
    public Role(String characterName) {
        this.characterName = characterName;
    }
}
