package com.github.yasukotelin.mycityapp.model

import androidx.compose.ui.graphics.Color

data class Location(
    val id: Int,
    val name: String,
    val description: String,
    val thumbnailColor: Color
)
