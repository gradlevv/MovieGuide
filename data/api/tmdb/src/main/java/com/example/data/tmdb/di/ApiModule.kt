package com.example.data.tmdb.di

import com.example.data.tmdb.TmdbMoviesRemoteSource
import com.example.data.tmdb.TmdbMoviesRemoteSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class ApiModule {

  @Binds
  abstract fun bindTmdbMoviesRemoteSource(impl: TmdbMoviesRemoteSourceImpl): TmdbMoviesRemoteSource

}
