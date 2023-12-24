package com.example.data.tmdb_movies

import com.example.data.model.VideoDetail
import com.example.data.model.VideoThumbnail
import com.example.data.tmdb.TmdbMoviesRemoteSource
import javax.inject.Inject

class TmdbMovieRepositoryImpl @Inject constructor(private val remoteSource: TmdbMoviesRemoteSource) :
  TmdbMovieRepository {
  override suspend fun getMovieDetail(movieId: Int): VideoDetail {
    return remoteSource.getMovieDetails(movieId)
  }

  override suspend fun getTrendingMovies(): List<VideoThumbnail> {
    return remoteSource.getTrendingMovies()
  }
}
