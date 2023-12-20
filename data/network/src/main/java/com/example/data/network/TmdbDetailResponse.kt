package com.example.data.network

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class TmdbDetailResponse(
  @SerialName("adult")
  val adult: Boolean,
  @SerialName("backdrop_path")
  val backdropPath: String,
  @SerialName("belongs_to_collection")
  val belongsToCollection: JsonElement,
  @SerialName("budget")
  val budget: Int,
  @SerialName("genres")
  val genres: List<Genre>,
  @SerialName("homepage")
  val homepage: String,
  @SerialName("id")
  val id: Int,
  @SerialName("imdb_id")
  val imdbId: String,
  @SerialName("original_language")
  val originalLanguage: String,
  @SerialName("original_title")
  val originalTitle: String,
  @SerialName("overview")
  val overview: String,
  @SerialName("popularity")
  val popularity: Double,
  @SerialName("poster_path")
  val posterPath: String,
  @SerialName("production_companies")
  val productionCompanies: List<ProductionCompany>,
  @SerialName("production_countries")
  val productionCountries: List<ProductionCountry>,
  @SerialName("release_date")
  val releaseDate: String,
  @SerialName("revenue")
  val revenue: Int,
  @SerialName("runtime")
  val runtime: Int,
  @SerialName("spoken_languages")
  val spokenLanguages: List<SpokenLanguage>,
  @SerialName("status")
  val status: String,
  @SerialName("tagline")
  val tagline: String,
  @SerialName("title")
  val title: String,
  @SerialName("video")
  val video: Boolean,
  @SerialName("vote_average")
  val voteAverage: Double,
  @SerialName("vote_count")
  val voteCount: Int,
)

@Serializable
data class Genre(
  val id: Long,
  val name: String,
)

@Serializable
data class ProductionCompany(
  val id: Long,

  @SerialName("logo_path")
  val logoPath: String? = null,

  val name: String,

  @SerialName("origin_country")
  val originCountry: String,
)

@Serializable
data class ProductionCountry(
  @SerialName("iso_3166_1")
  val iso3166_1: String,

  val name: String,
)

@Serializable
data class SpokenLanguage(
  @SerialName("english_name")
  val englishName: String,

  @SerialName("iso_639_1")
  val iso639_1: String,

  val name: String,
)

