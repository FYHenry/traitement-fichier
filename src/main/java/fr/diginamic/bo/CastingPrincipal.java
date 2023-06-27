package fr.diginamic.bo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/** Élément du Casting Principal */
@Entity
@Table(name = "Casting_principal")
public class CastingPrincipal implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_casting_principal")
    private int id;
    /** Identitfiant du nom */
    @Column(name = "name_id")
    private String nameId;
    /** Identité */
    @Column(name = "identite")
    private String identite;
    /** URL */
    @Column(name = "url")
    private String url;
    /** Naissance */
    @Embedded
    private Naissance naissance;
    /** Films */
    @ManyToMany(mappedBy = "castingPrincipals")
    private List<Film> films = new ArrayList<>();
    /** Construction */
    public CastingPrincipal() {
    }

    /** Construction avec paramètres.
     *
     * @param nameId Identifiant du nom
     * @param identite Identité
     * @param url URL
     */
    public CastingPrincipal(String nameId, String identite, String url) {
        this.nameId = nameId;
        this.identite = identite;
        this.url = url;
    }
}
