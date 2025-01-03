package com.github.yasukotelin.bookshelfapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.yasukotelin.bookshelfapp.ui.home.HomeScreen
import com.github.yasukotelin.bookshelfapp.ui.home.HomeViewModel
import com.github.yasukotelin.bookshelfapp.ui.theme.BookshelfAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BookshelfAppTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = RouteHomeScreen,
                ) {
                    composable<RouteHomeScreen> {
                        val viewModel = hiltViewModel<HomeViewModel>()
                        HomeScreen(viewModel)
                    }
                }
            }
        }
    }
}
