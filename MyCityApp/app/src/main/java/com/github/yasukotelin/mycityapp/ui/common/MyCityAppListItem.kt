package com.github.yasukotelin.mycityapp.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.yasukotelin.mycityapp.categories
import com.github.yasukotelin.mycityapp.ui.theme.MyCityAppTheme

@Composable
fun MyCityAppListItem(
    modifier: Modifier = Modifier,
    text: String,
    thumbnailColor: Color,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .height(80.dp)
            .clickable { onClick() }
            .padding(vertical = 8.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Thumbnail Color Box
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(3f / 2f)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(thumbnailColor)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = text,
            fontSize = 20.sp
        )
    }
}

@Preview
@Composable
private fun MyCityAppListItemPreview() {
    MyCityAppTheme {

        val category = categories.first()

        MyCityAppListItem(
            modifier = Modifier.fillMaxWidth(),
            text = category.name,
            thumbnailColor = category.thumbnailColor,
            onClick = { })
    }
}