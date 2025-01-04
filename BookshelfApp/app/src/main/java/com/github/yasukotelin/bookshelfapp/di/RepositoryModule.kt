package com.github.yasukotelin.bookshelfapp.di

import com.github.yasukotelin.bookshelfapp.data.repository.HomeVolumesRepository
import com.github.yasukotelin.bookshelfapp.data.repository.HomeVolumesRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(
        impl: HomeVolumesRepositoryImpl
    ): HomeVolumesRepository
}