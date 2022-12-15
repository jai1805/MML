package com.team15.MML.services;

import com.team15.MML.dto.MovieDetailResponse;
import com.team15.MML.dto.MovieResponse;
import com.team15.MML.model.Movies;
import com.team15.MML.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movies> getAllMovies() {
        return null;
    }

    @Override
    public List<MovieResponse> get250Movies() {
        return movieRepository.get250Movies();
    }

    @Override
    public List<MovieDetailResponse> getMovieDetail(String query){
        return movieRepository.getMovieDetail(query);
    }
}
