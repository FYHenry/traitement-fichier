package fr.diginamic.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JsonData implements Serializable {
    private List<FilmJson> films;

    public JsonData(List<FilmJson> films) {
        this.films = films;
    }

    public List<FilmJson> getFilms() {
        return films;
    }
}
