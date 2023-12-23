package com.example.domain.tmdb_movies

import com.example.data.model.VideoDetail
import com.example.data.model.VideoThumbnail

interface GetMovieDetailUseCase {
  suspend operator fun invoke(movieId: Int): VideoDetail
}
