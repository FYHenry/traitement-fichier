package fr.diginamic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

class RoleJson {
    @JsonProperty
    private String characterName;
    @JsonProperty
    private ActeurJson acteur;
    @JsonProperty
    private String film;

    public RoleJson(String characterName,
                    ActeurJson acteur,
                    String film) {
        this.characterName = characterName;
        this.acteur = acteur;
        this.film = film;
    }

    public String getCharacterName() {
        return characterName;
    }

    public ActeurJson getActeur() {
        return acteur;
    }

    public String getFilm() {
        return film;
    }
}
