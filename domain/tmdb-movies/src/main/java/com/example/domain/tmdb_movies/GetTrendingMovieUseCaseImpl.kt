package com.example.domain.tmdb_movies

import com.example.data.model.VideoThumbnail
import com.example.data.tmdb_movies.TmdbMovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

internal class GetTrendingMovieUseCaseImpl @Inject constructor(private val repository: TmdbMovieRepository) :
  GetTrendingMovieUseCase {
  override suspend fun invoke(): Flow<List<VideoThumbnail>> {
    return flow { emit(repository.getTrendingMovies()) }
  }
}
