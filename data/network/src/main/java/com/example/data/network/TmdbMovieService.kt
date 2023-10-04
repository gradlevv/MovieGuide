package com.example.data.network

import retrofit2.http.GET
import retrofit2.http.Path

interface TmdbMovieService {

  @GET("/movie/{movie_id}")
  suspend fun getMovieDetails(@Path("movie_id") movieId: Int): TmdbDetailResponse
}
