package com.example.data.tmdb_movies

import com.example.data.model.VideoThumbnail
import com.example.data.tmdb.TmdbMoviesRemoteSource
import javax.inject.Inject

class TmdbMovieRepositoryImpl @Inject constructor(private val remoteSource: TmdbMoviesRemoteSource) :
  TmdbMovieRepository {
  override suspend fun getMovieDetail(movieId: Int): VideoThumbnail {
    return remoteSource.getMovieDetails(movieId)
  }
}
