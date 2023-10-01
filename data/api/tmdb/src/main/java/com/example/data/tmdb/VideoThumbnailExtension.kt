package com.example.data.tmdb

import com.example.data.model.VideoId
import com.example.data.model.VideoThumbnail
import com.example.data.network.TmdbDetailResponse

fun TmdbDetailResponse.toVideoThumbnail(): VideoThumbnail {
  return VideoThumbnail(
    ids = VideoId(
      traktId = null,
      tmdbId = id,
    ),
    title = title,
    posterUrl = posterPath,
    year = releaseDate.take(4).toInt(),
  )
}
