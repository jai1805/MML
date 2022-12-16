package com.team15.MML.services;

import com.team15.MML.dto.*;
import com.team15.MML.model.Movies;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.Date;
import java.util.List;

@Service
public interface MovieService {
    List<Movies> getAllMovies();
    List<MovieResponse> get250Movies();

    List<MovieDetailResponse> getMovieDetail(String query);

    List<TopFiveResponse> getTopFiveAllTime();
    List<TopFiveYearResponse> getTopFiveEachYear(String query);

    List<BudgetResponse> getTopFiveBudget();

    List<GrossProfitResponse> getTopFiveGP();

    List<OneDecadeResponse> getEachYearDecade();


}
