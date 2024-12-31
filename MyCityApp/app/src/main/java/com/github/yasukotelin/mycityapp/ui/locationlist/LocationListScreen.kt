package com.github.yasukotelin.mycityapp.ui.locationlist

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.yasukotelin.mycityapp.categories
import com.github.yasukotelin.mycityapp.model.Location
import com.github.yasukotelin.mycityapp.ui.common.MyCityAppListItem
import com.github.yasukotelin.mycityapp.ui.theme.MyCityAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationListScreen(
    modifier: Modifier = Modifier,
    categoryId: Int,
    onClickBackNavigation: () -> Unit = {},
    onClickLocation: (Location) -> Unit = {},
) {
    val category = categories.find { it.id == categoryId }
        ?: throw IllegalArgumentException("Category not found")

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(category.name) },
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
            LazyColumn(modifier = Modifier.fillMaxSize()) {

                item {
                    Spacer(modifier = Modifier.height(16.dp))
                }

                items(category.locations) { location ->
                    MyCityAppListItem(
                        modifier = Modifier.fillMaxWidth(),
                        text = location.name,
                        thumbnailColor = location.thumbnailColor,
                        onClick = { onClickLocation(location) }
                    )

                    HorizontalDivider(
                        thickness = 1.dp,
                        color = Color.LightGray,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                item {
                    Spacer(modifier = Modifier.height(50.dp))
                }
            }
        }
    }
}

@Preview
@Composable
private fun LocationListScreenPreview() {
    MyCityAppTheme {
        LocationListScreen(
            categoryId = 1
        )
    }
}