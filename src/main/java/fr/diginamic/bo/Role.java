package fr.diginamic.bo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/** Rôle */
@Entity
@Table(name = "Role")
public class Role implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private int id;
    /** Nom du personage */
    @Column(name = "character_name")
    private String characterName;
    /** Acteurs */
    @ManyToMany
    @JoinTable(name = "Jouer",
            joinColumns = {@JoinColumn(name = "id_role_est")},
            inverseJoinColumns = {@JoinColumn(name = "id_acteur_a")})
    private List<Acteur> acteurs = new ArrayList<>();
    /** Films */
    @ManyToMany(mappedBy = "roles")
    private List<Film> films = new ArrayList<>();
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
