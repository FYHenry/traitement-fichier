package fr.diginamic.bo;
/** Réalisateur */
public class Realisateur implements Recordable {
    /** Identifiant (clef primaire) */
    private int id;
    /** Identité */
    private String identite;
    /** URL */
    private String url;
    /** Construction. */
    public Realisateur() {
    }

    /** COnstruction avec paramètres.
     *
     * @param identite Identité
     * @param url URL
     */
    public Realisateur(String identite, String url) {
        this.identite = identite;
        this.url = url;
    }
}
