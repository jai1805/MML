package com.team15.MML.controller;

import com.team15.MML.dto.MovieDetailResponse;
import com.team15.MML.dto.MovieResponse;
import com.team15.MML.model.Movies;
import com.team15.MML.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MovieController {
    @Autowired
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies250")
    public List<MovieResponse> get250Movies(){
        return movieService.get250Movies();

    }

    @GetMapping("/movieDetail")
    public List <MovieDetailResponse> getMovieDetail(@RequestParam("query") String query){
        return movieService.getMovieDetail(query);
    }

}