package com.github.yasukotelin.mycityapp.ui.categorylist

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.yasukotelin.mycityapp.categories
import com.github.yasukotelin.mycityapp.model.Category
import com.github.yasukotelin.mycityapp.ui.common.MyCityAppListItem
import com.github.yasukotelin.mycityapp.ui.theme.MyCityAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryList(
    modifier: Modifier = Modifier,
    onClickCategory: (Category) -> Unit = {},
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("My City App") },
            )
        }
    ) { innerPadding ->
        Box(modifier = modifier.padding(innerPadding)) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {

                item {
                    Spacer(modifier = Modifier.height(16.dp))
                }

                items(categories) { category ->
                    MyCityAppListItem(
                        modifier = Modifier.fillMaxWidth(),
                        text = category.name,
                        thumbnailColor = category.thumbnailColor,
                        onClick = { onClickCategory(category) }
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
private fun CategoryListPreview() {
    MyCityAppTheme {
        CategoryList()
    }
}