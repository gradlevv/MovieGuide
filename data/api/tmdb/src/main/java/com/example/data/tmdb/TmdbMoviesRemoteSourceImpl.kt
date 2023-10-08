package com.example.data.tmdb

import com.example.data.model.VideoThumbnail
import com.example.data.network.TmdbMovieService
import javax.inject.Inject

class TmdbMoviesRemoteSourceImpl @Inject constructor(private val tmdbMovieService: TmdbMovieService) : TmdbMoviesRemoteSource {
  override suspend fun getMovieDetails(movieId: Int): VideoThumbnail {
    return tmdbMovieService.getMovieDetails(movieId).toVideoThumbnail()
  }
}
