package com.team15.MML.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
    @Id
    private int genre_id;
    private String movie_id;
    private String genres;
}
