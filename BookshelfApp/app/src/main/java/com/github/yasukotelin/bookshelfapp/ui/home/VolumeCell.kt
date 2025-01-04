package com.github.yasukotelin.bookshelfapp.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.github.yasukotelin.bookshelfapp.R
import com.github.yasukotelin.bookshelfapp.mock.homeVolumesMockData
import com.github.yasukotelin.bookshelfapp.model.HomeVolume
import com.github.yasukotelin.bookshelfapp.ui.theme.BookshelfAppTheme

@Composable
fun VolumeCell(modifier: Modifier = Modifier, homeVolume: HomeVolume) {
    Column(modifier = modifier) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(homeVolume.secureThumbnail)
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.placeholder),
            error = painterResource(R.drawable.placeholder),
            contentDescription = "volume thumbnail",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(128 / 182f)
        )
        Spacer(Modifier.height(2.dp))
        Text(
            homeVolume.title,
            fontSize = 12.sp,
            color = Color.DarkGray,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun VolumeCellPreview() {
    BookshelfAppTheme {
        VolumeCell(
            modifier = Modifier.width(128.dp),
            homeVolume = homeVolumesMockData.first()
        )
    }
}