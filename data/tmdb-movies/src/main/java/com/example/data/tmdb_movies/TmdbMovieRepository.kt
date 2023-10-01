package com.example.data.tmdb_movies

import com.example.data.model.VideoThumbnail

interface TmdbMovieRepository {

  suspend fun getMovieDetail(movieId:Int): VideoThumbnail
}
