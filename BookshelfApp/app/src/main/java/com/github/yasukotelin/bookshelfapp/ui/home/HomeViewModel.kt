package com.github.yasukotelin.bookshelfapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.yasukotelin.bookshelfapp.data.repository.JazzHistoryBooksRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val jazzHistoryBooksRepository: JazzHistoryBooksRepository
): ViewModel() {

    init {
        viewModelScope.launch {
            println(jazzHistoryBooksRepository.get())
        }
    }
}