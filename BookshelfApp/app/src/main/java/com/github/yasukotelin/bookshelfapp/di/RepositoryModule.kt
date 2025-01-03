package com.github.yasukotelin.bookshelfapp.di

import com.github.yasukotelin.bookshelfapp.data.repository.JazzHistoryBooksRepository
import com.github.yasukotelin.bookshelfapp.data.repository.JazzHistoryBooksRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindJazzHistoryBooksRepository(
        impl: JazzHistoryBooksRepositoryImpl
    ): JazzHistoryBooksRepository
}