package com.team15.MML.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ratings {
    @Id
    private String tconst;
    private float averageRating;
    private int numVotes;
}
