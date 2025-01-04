package com.github.yasukotelin.bookshelfapp.data.repository

import com.github.yasukotelin.bookshelfapp.data.source.googlebooksapi.GoogleBooksApi
import com.github.yasukotelin.bookshelfapp.model.HomeVolume
import javax.inject.Inject

interface HomeVolumesRepository {
    suspend fun get(): List<HomeVolume>
}

class HomeVolumesRepositoryImpl @Inject constructor(
    private val googleBooksApi: GoogleBooksApi
) : HomeVolumesRepository {
    override suspend fun get(): List<HomeVolume> {
        return googleBooksApi.getJazzHistoryBooks().items.map { item ->
            HomeVolume(
                title = item.volumeInfo.title,
                thumbnail = item.volumeInfo.imageLinks?.thumbnail ?: ""
            )
        }
    }
}