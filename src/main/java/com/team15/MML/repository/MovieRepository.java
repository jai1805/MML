package com.team15.MML.repository;

import com.team15.MML.dto.*;
import com.team15.MML.entity.MoviesEntity;
import com.team15.MML.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.time.Year;
import java.util.Date;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MoviesEntity, String> {
    @Query(name = "get250movies", nativeQuery = true)
    List<MovieResponse> get250Movies();
    @Query(
            name = "getMovieDetail",
            nativeQuery = true
    )
    List<MovieDetailResponse> getMovieDetail(String query);

    @Query(name = "getTopFiveAllTime", nativeQuery = true)
    List<TopFiveResponse> getTopFiveAllTime();

    @Query(
            name = "getTopFiveEachYear",
            nativeQuery = true)
    List<TopFiveYearResponse> getTopFiveEachYear(String query);

    @Query(name = "getTopFiveBudget", nativeQuery = true)
    List<BudgetResponse> getTopFiveBudget();

    @Query(name = "getTopFiveGP", nativeQuery = true)
    List<GrossProfitResponse> getTopFiveGP();

    @Query(name = "getEachYearDecade", nativeQuery = true)
    List<OneDecadeResponse> getEachYearDecade();
}
