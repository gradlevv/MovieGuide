package com.example.home

import com.example.data.model.VideoThumbnail

data class HomeUiState(
  val isLoading: Boolean = false,
  val items: List<VideoThumbnail> = emptyList(),
)
