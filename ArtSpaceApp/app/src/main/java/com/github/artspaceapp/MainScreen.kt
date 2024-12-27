package com.github.artspaceapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.artspaceapp.model.artWorks
import com.github.artspaceapp.ui.elements.ArtWorkCard
import com.github.artspaceapp.ui.elements.ArtWorkTitle
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    val horizontalPagerState = rememberPagerState(
        pageCount = { artWorks.count() }
    )
    val coroutineScope = rememberCoroutineScope()

    suspend fun scrollToPrev() {
        val target = horizontalPagerState.currentPage - 1
        if (target >= 0) {
            horizontalPagerState.animateScrollToPage(page = target)
        }
    }

    suspend fun scrollToNext() {
        val target = horizontalPagerState.currentPage + 1
        if (target < artWorks.count()) {
            horizontalPagerState.animateScrollToPage(page = target)
        }
    }

    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(vertical = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    HorizontalPager(
                        modifier = Modifier.weight(1f),
                        state = horizontalPagerState,
                    ) { page ->
                        val artwork = artWorks.getOrNull(page) ?: return@HorizontalPager
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            ArtWorkCard(artwork, modifier = Modifier.padding(horizontal = 32.dp))
                        }
                    }

                    Spacer(Modifier.height(24.dp))

                    artWorks.getOrNull(horizontalPagerState.currentPage)?.let {
                        ArtWorkTitle(
                            artWork = it,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 32.dp)
                        )
                    }

                    Spacer(Modifier.height(24.dp))
                }

                Row {
                    Button(
                        onClick = {
                            coroutineScope.launch { scrollToPrev() }
                        },
                        modifier = Modifier.widthIn(min = 120.dp)
                    ) {
                        Text(text = "Previous")
                    }

                    Spacer(Modifier.width(32.dp))

                    Button(
                        onClick = {
                            coroutineScope.launch { scrollToNext() }
                        },
                        modifier = Modifier.widthIn(min = 120.dp)
                    ) {
                        Text(text = "Next")
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MaterialTheme {
        MainScreen()
    }
}