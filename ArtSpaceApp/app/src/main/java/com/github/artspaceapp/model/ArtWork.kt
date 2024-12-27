package com.github.artspaceapp.model

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.github.artspaceapp.R

data class ArtWork(
    val title: String,
    val artist: String,
    val created: String,
    @DrawableRes val pictureResId: Int
)

val artWorks = listOf(
    ArtWork(
        title = "秋の色",
        artist = "Telin.",
        created = "2024年",
        pictureResId = R.drawable.photo1
    ),
    ArtWork(
        title = "窓",
        artist = "Telin.",
        created = "2024年",
        pictureResId = R.drawable.photo2
    ),
    ArtWork(
        title = "カフェの窓際とクッキー",
        artist = "Telin.",
        created = "2024年",
        pictureResId = R.drawable.photo3
    ),
    ArtWork(
        title = "自動販売機",
        artist = "Telin.",
        created = "2024年",
        pictureResId = R.drawable.photo4
    )
)