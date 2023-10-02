package com.example.domain.tmdb_movies

import com.example.data.model.VideoThumbnail
import com.example.data.tmdb_movies.TmdbMovieRepository

internal class GetMovieDetailUseCaseImpl(private val repository: TmdbMovieRepository) :
  GetMovieDetailUseCase {
  override suspend fun invoke(movieId: Int): VideoThumbnail {
    return repository.getMovieDetail(movieId)
  }
}
