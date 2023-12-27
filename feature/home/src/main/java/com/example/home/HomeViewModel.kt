package com.example.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.tmdb_movies.GetTrendingMovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
  private val getTrendingMovieUseCase: GetTrendingMovieUseCase,
) : ViewModel() {

  private val _state = MutableStateFlow(HomeUiState(isLoading = false))
  val state = _state.asStateFlow()

  init {

    viewModelScope.launch {
      getTrendingMovieUseCase()
        .onStart { _state.update { it.copy(isLoading = true) } }
        .onCompletion { _state.update { it.copy(isLoading = false) } }
        .onEach {
          _state.update { state -> state.copy(items = it) }
        }
        .collect()
    }
  }
}
