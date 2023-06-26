package fr.diginamic.bo;

import jakarta.persistence.*;

import java.time.LocalDate;
/** Naissance */
@Entity
@Table(name = "Naissance")
public class Naissance implements Recordable {
    /** Identifiant (clef primaire) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /** Date */
    @Column(name = "date")
    private LocalDate date;
    /** Lieu */
    @Column(name = "lieu")
    private String lieu;
    /** Construction */
    public Naissance() {
    }

    /** Construction avec paramètres.
     *
     * @param date Date
     * @param lieu Lieu
     */
    public Naissance(LocalDate date, String lieu) {
        this.date = date;
        this.lieu = lieu;
    }
}
