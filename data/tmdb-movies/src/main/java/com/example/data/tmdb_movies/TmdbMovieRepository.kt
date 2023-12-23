package com.example.data.tmdb_movies

import com.example.data.model.VideoDetail
import com.example.data.model.VideoThumbnail

interface TmdbMovieRepository {

  suspend fun getMovieDetail(movieId:Int): VideoDetail
}
