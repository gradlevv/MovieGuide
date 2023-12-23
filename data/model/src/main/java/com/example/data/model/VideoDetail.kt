package com.example.data.model

class VideoDetail(
  val ids: VideoId,
  val title: String,
  val posterUrl: String,
  val coverUrl: String,
  val year: Int,
  val genres: List<String>,
  val originalLanguage: String?,
  val tagLine: String,
  val spokenLanguage: List<String>,
  val description: String,
)
