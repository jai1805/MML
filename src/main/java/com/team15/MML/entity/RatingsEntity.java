package com.team15.MML.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ratings")
@AllArgsConstructor
@NoArgsConstructor
public class RatingsEntity {
    @Id
    private String tconst;
    private float averageRating;
    private int numVotes;
}
