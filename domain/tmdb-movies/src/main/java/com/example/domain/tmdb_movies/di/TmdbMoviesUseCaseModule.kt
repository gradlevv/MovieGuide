package com.example.domain.tmdb_movies.di

import com.example.domain.tmdb_movies.GetMovieDetailUseCase
import com.example.domain.tmdb_movies.GetMovieDetailUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class TmdbMoviesUseCaseModule {

  @Binds
  abstract fun bindTmdbMoviesUseCase(impl: GetMovieDetailUseCaseImpl): GetMovieDetailUseCase
}
