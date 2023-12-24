package com.example.data.network


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class TrendingResponse(
  @SerialName("page")
  val page: Int?,
  @SerialName("results")
  val results: List<TmdbVideoResult>?,
  @SerialName("total_pages")
  val totalPages: Int?,
  @SerialName("total_results")
  val totalResults: Int?,
)

@Keep
@Serializable
data class TmdbVideoResult(
  @SerialName("adult")
  val adult: Boolean?,
  @SerialName("backdrop_path")
  val backdropPath: String?,
  @SerialName("genre_ids")
  val genreIds: List<Int?>?,
  @SerialName("id")
  val id: Int?,
  @SerialName("media_type")
  val mediaType: String?,
  @SerialName("original_language")
  val originalLanguage: String?,
  @SerialName("original_title")
  val originalTitle: String?,
  @SerialName("overview")
  val overview: String?,
  @SerialName("popularity")
  val popularity: Double?,
  @SerialName("poster_path")
  val posterPath: String?,
  @SerialName("release_date")
  val releaseDate: String?,
  @SerialName("title")
  val title: String?,
  @SerialName("video")
  val video: Boolean?,
  @SerialName("vote_average")
  val voteAverage: Double?,
  @SerialName("vote_count")
  val voteCount: Int?,
)
