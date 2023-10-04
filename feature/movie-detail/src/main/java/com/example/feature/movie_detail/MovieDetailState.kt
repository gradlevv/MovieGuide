package com.example.feature.movie_detail

import com.example.data.model.VideoThumbnail

data class MovieDetailState(
  val isLoading: Boolean = false,
  val videoThumbnail: VideoThumbnail? = null,
)
