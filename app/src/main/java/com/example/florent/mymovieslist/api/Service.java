package com.example.florent.mymovieslist.api;

import com.example.florent.mymovieslist.model.MoviesResponse;
import com.example.florent.mymovieslist.model.TrailerResponse;

import retrofit2.Call;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.GET;

public interface Service {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String api_key);


    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String api_key);

    @GET("movie/now_playing")
    Call<MoviesResponse> getPlayingMovies(@Query("api_key") String api_key);


    @GET("movie/{movie_id}/videos")
    Call<TrailerResponse> getMovieTrailer(@Path("movie_id") int id, @Query("api_key") String apiKey);
}
