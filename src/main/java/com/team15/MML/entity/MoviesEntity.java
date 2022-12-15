package com.team15.MML.entity;

import com.team15.MML.dto.MovieDetailResponse;
import com.team15.MML.dto.MovieResponse;
import com.team15.MML.model.Actors;
import com.team15.MML.model.Genre;
import com.team15.MML.model.Ratings;
import com.team15.MML.model.Titles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

//select * from movies inner join titles on movies.movie_id = titles.movie_id where movies.movie_id="query";
@NamedNativeQuery(
        name = "get250movies",
        query = "select movies.movie_id,original_title, genres, release_date, averageRating, numVotes from " +
                "(select movie_id, genres, averageRating, numVotes from (select * from genre, ratings where genre.movie_id=ratings.tconst order by numVotes desc limit 300)t1 order by " +
                "averageRating desc)t2 left join movies on t2.movie_id=movies.movie_id where original_title is not null order by averageRating desc limit 250;",
        resultSetMapping = "get250MoviesDto"
)
@NamedNativeQuery(
        name = "getMovieDetail",
        query = "select titles.movie_id,titles.primaryTitle, movies.release_date,ratings.averageRating,titles.runtimeMinutes,movies.budget,movies.revenue, movies.overview from titles, ratings , genre, movies where " +
                "titles.movie_id=ratings.tconst and ratings.tconst=genre.movie_id and titles.movie_id=movies.movie_id and titles.movie_id= :query ;",
        resultSetMapping = "getMovieDetailDto"

)
@SqlResultSetMapping(name = "get250MoviesDto",
        classes = @ConstructorResult(
                targetClass = MovieResponse.class,
                columns = {
                        @ColumnResult(name="movie_id", type=String.class),
                        @ColumnResult(name="original_title",type = String.class),
                        @ColumnResult(name="genres", type = String.class),
                        @ColumnResult(name="release_date", type = Date.class),
                        @ColumnResult(name="averageRating", type=Float.class),
                        @ColumnResult(name = "numVotes", type=Integer.class)
                }
        )
)
@SqlResultSetMapping(name = "getMovieDetailDto",
        classes = @ConstructorResult(
                targetClass = MovieDetailResponse.class,
                columns = {
                        @ColumnResult(name="movie_id", type=String.class),
                        @ColumnResult(name="primaryTitle",type = String.class),
                        @ColumnResult(name="release_date", type = Date.class),
                        @ColumnResult(name="averageRating", type=Float.class),
                        @ColumnResult(name = "runtimeMinutes", type=Integer.class),
                        @ColumnResult(name="budget", type=Integer.class),
                        @ColumnResult(name="revenue", type=Integer.class),
                        @ColumnResult(name="overview", type=String.class)
                }
        )
)
@Entity
@Data
@Table(name = "movies")
@NoArgsConstructor
@AllArgsConstructor
public class MoviesEntity {
    private int budget;
    @Id
    private String movie_id;
    private String original_title;
    private String overview;
    private double popularity;
    private String poster_path;
    private Date release_date;
    private float revenue;
    private int runtime;
    private String status;
    private String title;
    private float vote_avg;
    private int vote_count;
    @OneToOne(targetEntity = TitlesEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name="movie_id")
    private List<Titles> titles;

    @OneToOne(targetEntity = GenreEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name="movie_id")
    private List<Genre> genre;

    @OneToOne(targetEntity = RatingsEntity.class ,cascade = CascadeType.ALL)
    @JoinColumn(name="tconst")
    private List<Ratings> ratings;

    @ManyToMany(targetEntity = ActorsEntity.class, cascade = CascadeType.ALL)
    @JoinTable(
            joinColumns = @JoinColumn(name = "knownForTitles"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private List<Actors> actors;
}
