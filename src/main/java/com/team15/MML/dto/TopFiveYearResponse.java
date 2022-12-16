package com.team15.MML.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopFiveYearResponse {
    private String original_title;
    private float averageRating;
    private int numVotes;
    private int GROSS_PROFIT;
}
