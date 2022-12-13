package com.team15.MML.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movies {
    private int budget;
    @Id
    private String movie_id;
    private String original_title;
    private String overview;
    private double popularity;
    private String poster_path;
    private Date release_date;
    private float revenue;
    private int runtime;
    private String status;
    private String title;
    private float vote_avg;
    private int vote_count;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="movie_id")
    private List<Titles> titles;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="movie_id")
    private List<Genre> genre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tconst")
    private List<Ratings> ratings;

    @ManyToMany
    @JoinTable(
            name = "Actors",
            joinColumns = @JoinColumn(name = "knownForTitles"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private List<Actors> actors;
}
