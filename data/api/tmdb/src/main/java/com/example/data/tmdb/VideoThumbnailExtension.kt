package com.example.data.tmdb

import com.example.data.model.VideoDetail
import com.example.data.model.VideoId
import com.example.data.model.VideoThumbnail
import com.example.data.network.TmdbDetailResponse

private val TMDB_BASE_IMAGE_URL = "https://image.tmdb.org/t/p/original"

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

fun TmdbDetailResponse.toVideoDetail(): VideoDetail {
  return VideoDetail(
    ids = VideoId(
      traktId = null,
      tmdbId = id,
    ),
    title = title,
    posterUrl = TMDB_BASE_IMAGE_URL.plus(posterPath),
    coverUrl = TMDB_BASE_IMAGE_URL.plus(backdropPath),
    year = releaseDate.take(4).toInt(),
    genres = genres.map { it.name },
    originalLanguage = originalLanguage,
    spokenLanguage = spokenLanguages.run { map { it.englishName }.filter { it.isNotEmpty() } },
    description = overview,
    tagLine = tagline,
  )
}
