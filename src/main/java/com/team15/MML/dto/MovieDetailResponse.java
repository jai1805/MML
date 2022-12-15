package com.team15.MML.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailResponse {
    private String movie_id;
    private String primaryTitle;
    private Date release_date;
    private float averageRating;
    private int runtimeMinutes;
    private int budget;
    private int revenue;
    private String overview;
}
