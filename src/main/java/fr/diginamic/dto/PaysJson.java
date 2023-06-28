package fr.diginamic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

class PaysJson {
    @JsonProperty
    private String nom;
    @JsonProperty
    private String url;

    public PaysJson(String nom,
                    String url) {
        this.nom = nom;
        this.url = url;
    }

    public String getNom() {
        return nom;
    }

    public String getUrl() {
        return url;
    }
}
