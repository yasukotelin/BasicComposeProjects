package com.github.yasukotelin.bookshelfapp.data.source.googlebooksapi

import com.github.yasukotelin.bookshelfapp.data.source.googlebooksapi.model.VolumesResponse
import retrofit2.http.GET

interface GoogleBooksApi {

    @GET("volumes?q=jazz")
    suspend fun getJazzHistoryBooks(): VolumesResponse
}