package com.example.data.tmdb_movies.di

import com.example.data.tmdb_movies.TmdbMovieRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class TmdbMovieModule {

  @Binds
  abstract fun bindTmdbMovieRepository(impl: TmdbMovieRepositoryImpl): TmdbMovieModule
}
