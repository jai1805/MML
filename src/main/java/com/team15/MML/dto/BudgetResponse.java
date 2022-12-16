package com.team15.MML.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetResponse {
    private String original_title;
    private float averageRating;
    private int numVotes;
    private int budget;
}
