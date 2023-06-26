package fr.diginamic.bo;

import jakarta.persistence.*;

/** Élément du Casting Principal */
@Entity
@Table(name = "casting_principal")
public class CastingPrincipal implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
