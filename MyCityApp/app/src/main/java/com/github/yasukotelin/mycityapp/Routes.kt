package com.github.yasukotelin.mycityapp

import kotlinx.serialization.Serializable

@Serializable
object RouteCategoryListScreen

@Serializable
data class RouteLocationListScreen(val categoryId: Int)

@Serializable
data class RouteLocationDetailScreen(val categoryId: Int, val locationId: Int)
