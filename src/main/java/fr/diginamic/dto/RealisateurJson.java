package fr.diginamic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

class RealisateurJson {
    @JsonProperty
    private String identite;
    @JsonProperty
    private String url;

    public RealisateurJson(String identite,
                           String url) {
        this.identite = identite;
        this.url = url;
    }

    public String getIdentite() {
        return identite;
    }

    public String getUrl() {
        return url;
    }
}
