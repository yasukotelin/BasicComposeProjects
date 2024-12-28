package com.github.yasukotelin.a30daysofdiary.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.yasukotelin.a30daysofdiary.model.Post
import com.github.yasukotelin.a30daysofdiary.model.posts
import com.github.yasukotelin.a30daysofdiary.ui.theme.A30DaysOfDiaryTheme

@Composable
fun PostCard(
    post: Post,
    modifier: Modifier = Modifier
) {
    var isExpand by remember { mutableStateOf(false) }

    Card(
        modifier = modifier.clickable {
            isExpand = !isExpand
        },
        colors = CardDefaults.cardColors()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Day ${post.day}",
                fontSize = 24.sp,
            )

            Spacer(Modifier.height(8.dp))

            Image(
                painter = painterResource(post.pictureResId),
                contentDescription = "picture image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.clip(RoundedCornerShape(8.dp))
            )

            Spacer(Modifier.height(8.dp))

            AnimatedVisibility(isExpand) {
                Text(
                    text = post.text,
                    fontSize = 14.sp,
                )
            }
        }
    }
}

@Composable
@PreviewLightDark
fun PostCardPreview() {
    A30DaysOfDiaryTheme {
        PostCard(post = posts.first(), modifier = Modifier.fillMaxWidth())
    }
}