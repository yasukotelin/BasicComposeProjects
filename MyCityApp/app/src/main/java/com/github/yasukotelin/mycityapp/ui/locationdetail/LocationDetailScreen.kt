package com.github.yasukotelin.mycityapp.ui.locationdetail

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.yasukotelin.mycityapp.categories
import com.github.yasukotelin.mycityapp.model.Location
import com.github.yasukotelin.mycityapp.ui.theme.MyCityAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationDetailScreen(
    modifier: Modifier = Modifier,
    categoryId: Int,
    locationId: Int,
    onClickBackNavigation: () -> Unit = {},
    onClickLocation: (Location) -> Unit = {},
) {
    val category = categories.find { it.id == categoryId }
        ?: throw IllegalArgumentException("Category not found")
    val location = category.locations.find { it.id == locationId }
        ?: throw IllegalArgumentException("Location not found")

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(location.name) },
                navigationIcon = {
                    IconButton(onClick = { onClickBackNavigation() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back navigation"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = modifier.padding(innerPadding)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Box(
                    modifier = Modifier
                        .padding(vertical = 16.dp, horizontal = 16.dp)
                        .fillMaxWidth()
                        .aspectRatio(3f / 2f)
                        .background(location.thumbnailColor)
                )

                Spacer(Modifier.height(16.dp))

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = location.description,
                    fontSize = 12.sp,
                )

                Spacer(Modifier.height(16.dp))

                Text(
                    text = "その他のロケーション",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                Spacer(Modifier.height(8.dp))

                LocationCarousel(
                    locations = category.locations.filterNot { it.id == locationId },
                    modifier = Modifier.fillMaxWidth(),
                    onClickLocation = onClickLocation
                )

                Spacer(Modifier.height(50.dp))
            }
        }
    }
}

@Composable
fun LocationCarousel(
    locations: List<Location>,
    modifier: Modifier = Modifier,
    onClickLocation: (Location) -> Unit = {},
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(locations) { location ->
            Column {
                Box(
                    modifier = Modifier
                        .width(140.dp)
                        .aspectRatio(3f / 2f)
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(location.thumbnailColor)
                        .clickable(onClick = { onClickLocation(location) })
                )

                Spacer(Modifier.height(2.dp))

                Text(
                    text = location.name,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview
@Composable
private fun LocationListScreenPreview() {
    MyCityAppTheme {
        LocationDetailScreen(
            categoryId = 1,
            locationId = 1
        )
    }
}