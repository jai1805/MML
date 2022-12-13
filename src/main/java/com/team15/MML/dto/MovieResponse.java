package com.team15.MML.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {
    private String original_title;
    private String genres;
    private Date release_date;
    private float averageRating;
    private int numVotes;

}
