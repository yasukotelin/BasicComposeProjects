package com.github.yasukotelin.bookshelfapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.yasukotelin.bookshelfapp.data.repository.HomeVolumesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeVolumesRepository: HomeVolumesRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            val response = homeVolumesRepository.get()
            _uiState.update { state ->
                state.copy(
                    isLoading = false,
                    volumes = response
                )
            }
        }
    }
}