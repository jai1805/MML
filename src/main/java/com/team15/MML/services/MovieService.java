package com.team15.MML.services;

import com.team15.MML.dto.MovieDetailResponse;
import com.team15.MML.dto.MovieResponse;
import com.team15.MML.model.Movies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {
    List<Movies> getAllMovies();
    List<MovieResponse> get250Movies();

    List<MovieDetailResponse> getMovieDetail(String query);


}
