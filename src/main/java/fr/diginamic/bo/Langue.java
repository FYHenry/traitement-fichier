package fr.diginamic.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    @JsonIgnore
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

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCode() {
        return code;
    }

    public List<Film> getFilms() {
        return films;
    }
}
