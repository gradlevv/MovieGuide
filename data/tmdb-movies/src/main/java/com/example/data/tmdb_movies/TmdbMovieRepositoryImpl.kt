package com.example.data.tmdb_movies

import com.example.data.model.VideoThumbnail
import com.example.data.tmdb.TmdbMoviesRemoteSource

class TmdbMovieRepositoryImpl(private val remoteSource: TmdbMoviesRemoteSource) :
  TmdbMovieRepository {
  override suspend fun getMovieDetail(movieId: Int): VideoThumbnail {
    return remoteSource.getMovieDetails(movieId)
  }
}
