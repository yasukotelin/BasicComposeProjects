package com.github.artspaceapp.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.artspaceapp.model.ArtWork
import com.github.artspaceapp.model.artWorks

@Composable
fun ArtWorkCard(
    artWork: ArtWork,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardColors(
            containerColor = Color.White,
            contentColor = Color.DarkGray,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.DarkGray
        ),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Image(
            painter = painterResource(artWork.pictureResId),
            contentScale = ContentScale.Fit,
            contentDescription = "art work picture image"
        )
    }
}

@Composable
@Preview
fun ArtWorkPreview() {
    MaterialTheme {
        ArtWorkCard(
            artWork = artWorks.first(),
            modifier = Modifier.fillMaxWidth()
        )
    }
}