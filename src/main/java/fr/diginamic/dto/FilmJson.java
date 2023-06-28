package fr.diginamic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class FilmJson {
    @JsonProperty
    private String id;
    @JsonProperty
    private PaysJson pays;
    @JsonProperty
    private String nom;
    @JsonProperty
    private String url;
    @JsonProperty
    private String plot;
    @JsonProperty
    private String langue;
    @JsonProperty
    private String lieuTournage;
    @JsonProperty
    private ArrayList<RealisateurJson> realisateurs;
    @JsonProperty
    private ArrayList<CastingElementJson> castingPrincipal;
    @JsonProperty
    private String anneeSortie;
    @JsonProperty
    private ArrayList<RoleJson> roles;
    @JsonProperty
    private ArrayList<String> genres;

    public FilmJson(String id,
                    PaysJson pays,
                    String nom,
                    String url,
                    String plot,
                    String langue,
                    String lieuTournage,
                    ArrayList<RealisateurJson> realisateurs,
                    ArrayList<CastingElementJson> castingPrincipal,
                    String anneeSortie,
                    ArrayList<RoleJson> roles,
                    ArrayList<String> genres) {
        this.id = id;
        this.pays = pays;
        this.nom = nom;
        this.url = url;
        this.plot = plot;
        this.langue = langue;
        this.lieuTournage = lieuTournage;
        this.realisateurs = realisateurs;
        this.castingPrincipal = castingPrincipal;
        this.anneeSortie = anneeSortie;
        this.roles = roles;
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public PaysJson getPays() {
        return pays;
    }

    public String getNom() {
        return nom;
    }

    public String getUrl() {
        return url;
    }

    public String getPlot() {
        return plot;
    }

    public String getLangue() {
        return langue;
    }

    public String getLieuTournage() {
        return lieuTournage;
    }

    public ArrayList<RealisateurJson> getRealisateurs() {
        return realisateurs;
    }

    public ArrayList<CastingElementJson> getCastingPrincipal() {
        return castingPrincipal;
    }

    public String getAnneeSortie() {
        return anneeSortie;
    }

    public ArrayList<RoleJson> getRoles() {
        return roles;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }
}
