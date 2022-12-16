package com.team15.MML.services;

import com.team15.MML.dto.*;
import com.team15.MML.model.Movies;
import com.team15.MML.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.Date;
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

    @Override
    public List<TopFiveResponse> getTopFiveAllTime(){ return movieRepository.getTopFiveAllTime(); }


    @Override
    public List<TopFiveYearResponse> getTopFiveEachYear(String query){ return movieRepository.getTopFiveEachYear(query); }
    @Override
    public List<BudgetResponse> getTopFiveBudget() {return movieRepository.getTopFiveBudget();}

    @Override
    public List<GrossProfitResponse> getTopFiveGP() {return movieRepository.getTopFiveGP();}

    @Override
    public List<OneDecadeResponse> getEachYearDecade() {return movieRepository.getEachYearDecade();}

    @Override
    public List<MovieResponse> getSearchMovie(String query){
        return movieRepository.getSearchMovie(query);
    }

}
