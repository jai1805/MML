package com.team15.MML.controller;

import com.team15.MML.dto.*;
import com.team15.MML.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.Date;
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

    @GetMapping("/topFive")
    public List<TopFiveResponse> getTopFiveAllTime(){
        return movieService.getTopFiveAllTime();
    }

    @GetMapping("/top5yearly")
    public List<TopFiveYearResponse> getTopFiveEachYear(@RequestParam("query") String query ){
        return movieService.getTopFiveEachYear(query);
    }

    @GetMapping("/top5budget")
    public List<BudgetResponse> getTopFiveBudget(){
        return movieService.getTopFiveBudget();
    }

    @GetMapping("/top5GP")
    public List<GrossProfitResponse> getTopFiveGP(){
        return movieService.getTopFiveGP();
    }

    @GetMapping("/eachYD")
    public List<OneDecadeResponse> getEachYearDecade(){
        return movieService.getEachYearDecade();
    }
    @GetMapping("/movieSearch")
    public List <MovieResponse> getSearchMovie(@RequestParam("query") String query){
        return movieService.getSearchMovie(query);
    }

}