package com.team15.MML.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OneDecadeResponse {
    private String movie_id;
    private String original_title;
    private Date release_date;
    private int profit;
}
