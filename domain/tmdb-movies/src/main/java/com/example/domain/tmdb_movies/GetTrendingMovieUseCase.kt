package com.example.domain.tmdb_movies

import com.example.data.model.VideoThumbnail
import kotlinx.coroutines.flow.Flow

interface GetTrendingMovieUseCase {
  suspend operator fun invoke(): Flow<List<VideoThumbnail>>
}
