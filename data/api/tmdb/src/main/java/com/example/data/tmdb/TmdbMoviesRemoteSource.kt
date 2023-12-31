package com.example.data.tmdb

import com.example.data.model.VideoDetail
import com.example.data.model.VideoThumbnail

interface TmdbMoviesRemoteSource {
  suspend fun getMovieDetails(movieId: Int): VideoDetail
  suspend fun getTrendingMovies(): List<VideoThumbnail>
}
