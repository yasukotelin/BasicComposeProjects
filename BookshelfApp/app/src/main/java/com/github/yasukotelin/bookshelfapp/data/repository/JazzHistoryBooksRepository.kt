package com.github.yasukotelin.bookshelfapp.data.repository

import com.github.yasukotelin.bookshelfapp.data.source.GoogleBooksApi
import com.github.yasukotelin.bookshelfapp.model.VolumesResponse
import javax.inject.Inject

interface JazzHistoryBooksRepository {
    suspend fun get(): VolumesResponse
}

class JazzHistoryBooksRepositoryImpl @Inject constructor(
    private val googleBooksApi: GoogleBooksApi
) : JazzHistoryBooksRepository {
    override suspend fun get(): VolumesResponse {
        return googleBooksApi.getJazzHistoryBooks()
    }
}