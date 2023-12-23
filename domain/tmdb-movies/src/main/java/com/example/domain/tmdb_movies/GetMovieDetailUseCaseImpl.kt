package com.example.domain.tmdb_movies

import com.example.data.model.VideoDetail
import com.example.data.model.VideoThumbnail
import com.example.data.tmdb_movies.TmdbMovieRepository
import javax.inject.Inject

internal class GetMovieDetailUseCaseImpl @Inject constructor(private val repository: TmdbMovieRepository) :
  GetMovieDetailUseCase {
  override suspend fun invoke(movieId: Int): VideoDetail {
    return repository.getMovieDetail(movieId)
  }
}
