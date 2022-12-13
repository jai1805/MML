package com.team15.MML.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "genre")
@NoArgsConstructor
@AllArgsConstructor
public class GenreEntity {
    @Id
    private int genre_id;
    private String movie_id;
    private String genres;
}
