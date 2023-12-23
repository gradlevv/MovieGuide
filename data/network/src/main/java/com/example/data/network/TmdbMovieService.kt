package com.example.data.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TmdbMovieService {

  @GET("movie/{movie_id}")
  suspend fun getMovieDetails(
    @Path("movie_id") movieId: Int,
    @Query("api_key") apiKey: String = "810c562d7da2a5e12bb916fd87db80ac",
  ): TmdbDetailResponse
}

//suspend fun main() {
//
//  val json = Json { ignoreUnknownKeys = true }
//  val retrofit = Retrofit.Builder()
//    .baseUrl("https://api.themoviedb.org/3/")
//    .addConverterFactory(
//      json.asConverterFactory(MediaType.get("application/json")),
//    )
//    .build()
//
//  val service = retrofit.create(TmdbMovieService::class.java)
//  val result = service.getMovieDetails(15733)
//  println(result)
//}
