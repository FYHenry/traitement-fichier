package fr.diginamic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

class CastingElementJson {
    @JsonProperty
    private String id;
    @JsonProperty
    private String identite;
    @JsonProperty
    private NaissanceJson naissance;
    @JsonProperty
    private String url;
    @JsonProperty
    private String height;
    @JsonProperty
    private ArrayList<RoleJson> roles;

    public CastingElementJson(String id,
                              String identite,
                              NaissanceJson naissance,
                              String url,
                              String height,
                              ArrayList<RoleJson> roles) {
        this.id = id;
        this.identite = identite;
        this.naissance = naissance;
        this.url = url;
        this.height = height;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public String getIdentite() {
        return identite;
    }

    public NaissanceJson getNaissance() {
        return naissance;
    }

    public String getUrl() {
        return url;
    }

    public String getHeight() {
        return height;
    }

    public ArrayList<RoleJson> getRoles() {
        return roles;
    }
}
