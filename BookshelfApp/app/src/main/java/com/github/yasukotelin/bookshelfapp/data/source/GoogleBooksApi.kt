package com.github.yasukotelin.bookshelfapp.data.source

import com.github.yasukotelin.bookshelfapp.model.VolumesResponse
import retrofit2.http.GET

interface GoogleBooksApi {

    @GET("volumes?q=jazz+history")
    suspend fun getJazzHistoryBooks(): VolumesResponse
}