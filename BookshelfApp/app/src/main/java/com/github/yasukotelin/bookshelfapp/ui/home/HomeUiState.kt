package com.github.yasukotelin.bookshelfapp.ui.home

import com.github.yasukotelin.bookshelfapp.model.HomeVolume


data class HomeUiState(
    val isLoading: Boolean = true,
    val volumes: List<HomeVolume> = emptyList()
)