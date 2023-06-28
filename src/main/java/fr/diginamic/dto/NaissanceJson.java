package fr.diginamic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

class NaissanceJson {
    @JsonProperty
    private String dateNaissance;
    @JsonProperty
    private String lieuNaissance;

    public NaissanceJson(String dateNaissance,
                         String lieuNaissance) {
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }
}
