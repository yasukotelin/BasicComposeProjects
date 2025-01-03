package com.github.yasukotelin.bookshelfapp

import kotlinx.serialization.Serializable

@Serializable
object RouteHomeScreen

@Serializable
data class RouteBookDetailScreen(val volumeId: Int)