package com.example.data.tmdb

import com.example.data.model.VideoDetail

interface TmdbMoviesRemoteSource {
  suspend fun getMovieDetails(movieId: Int): VideoDetail
}
