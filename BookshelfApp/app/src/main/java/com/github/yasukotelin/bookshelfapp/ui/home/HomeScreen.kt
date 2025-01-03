package com.github.yasukotelin.bookshelfapp.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.yasukotelin.bookshelfapp.ui.theme.BookshelfAppTheme

@Composable
fun HomeScreen(
    viewModel: HomeViewModel
) {
    HomeScreen()
}

@Composable
private fun HomeScreen() {
    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {

        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    BookshelfAppTheme {
        HomeScreen()
    }
}