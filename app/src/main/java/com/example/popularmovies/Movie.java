package com.example.popularmovies;

import java.text.DecimalFormat;

public class Movie {
    private String title;
    private String poster;
    private double rating;
    private String overview;

    public Movie(String title, String poster, Double rating, String overview) {
        this.title = title;
        this.poster = poster;
        this.rating = rating;
        this.overview = overview;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster() {
        return poster;
    }

    public String getRating() {
        DecimalFormat df_obj = new DecimalFormat("#.#");
        return df_obj.format(rating);
    }

    public String getOverview() {
        return overview;
    }
}
