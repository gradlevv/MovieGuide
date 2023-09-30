package com.example.data.network

import retrofit2.http.GET

interface TmdbMovieService {

  @GET("/movie/{movie_id}")
  suspend fun getMovieDetails(movieId: Int): TmdbDetailResponse
}
