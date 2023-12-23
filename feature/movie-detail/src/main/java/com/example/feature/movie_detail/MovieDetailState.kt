package com.example.feature.movie_detail

import com.example.data.model.VideoDetail

data class MovieDetailState(
  val isLoading: Boolean = false,
  val videoDetail: VideoDetail? = null,
)
