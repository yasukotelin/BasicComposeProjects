package com.github.yasukotelin.mycityapp.model

import androidx.compose.ui.graphics.Color

data class Category(
    val id: Int,
    val name: String,
    val thumbnailColor: Color,
    val locations: List<Location>
)