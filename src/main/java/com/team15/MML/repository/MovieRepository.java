package com.team15.MML.repository;

import com.team15.MML.dto.MovieResponse;
import com.team15.MML.entity.MoviesEntity;
import com.team15.MML.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MoviesEntity, String> {
    @Query(name = "get250movies", nativeQuery = true)
    List<MovieResponse> get250Movies();
}