package com.example.data.network.di

import com.example.data.network.TmdbMovieService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

  @Provides
  @Singleton
  fun providesJson(): Json {
    return Json {
      ignoreUnknownKeys = true
    }
  }

  @Provides
  @Singleton
  fun providesRetrofit(json: Json): Retrofit {

    return Retrofit.Builder()
      .baseUrl("https://api.themoviedb.org/3/")
      .addConverterFactory(json.asConverterFactory(MediaType.get("application/json")))
      .build()
  }

  @Provides
  @Singleton
  fun provides(retrofit: Retrofit): TmdbMovieService {
    return retrofit.create(TmdbMovieService::class.java)
  }

}
