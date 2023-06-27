package fr.diginamic.bo;

import jakarta.persistence.*;

import java.time.LocalDate;
/** Naissance */
@Embeddable
public class Naissance implements Recordable {
    /** Date */
    @Column(name = "date_naissance")
    private LocalDate date;
    /** Lieu */
    @Column(name = "lieu_naissance")
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
