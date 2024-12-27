package com.github.artspaceapp.ui.elements

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.artspaceapp.model.ArtWork
import com.github.artspaceapp.model.artWorks

@Composable
fun ArtWorkTitle(
    artWork: ArtWork,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xffe8e8e8))
            .padding(16.dp)
    ) {
        AnimatedContent(
            artWork,
            label = "",
            transitionSpec = {
                // 内容の切り替えにCrossfadeアニメーションを指定
                fadeIn(animationSpec = tween(300)) togetherWith fadeOut(animationSpec = tween(300))
            }
        ) { aw ->
            Column {
                Text(
                    text = aw.title,
                    fontSize = 20.sp,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row {
                    Text(
                        text = "Photo by ${aw.artist}",
                        fontSize = 12.sp,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = aw.created,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun ArtWorkTitlePreview() {
    MaterialTheme {
        ArtWorkTitle(
            artWork = artWorks.first(),
            modifier = Modifier.fillMaxWidth()
        )
    }
}