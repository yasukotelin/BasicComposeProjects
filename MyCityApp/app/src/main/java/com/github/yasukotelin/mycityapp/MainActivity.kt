package com.github.yasukotelin.mycityapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.github.yasukotelin.mycityapp.ui.categorylist.CategoryList
import com.github.yasukotelin.mycityapp.ui.locationdetail.LocationDetailScreen
import com.github.yasukotelin.mycityapp.ui.locationlist.LocationListScreen
import com.github.yasukotelin.mycityapp.ui.theme.MyCityAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCityAppTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = RouteCategoryListScreen,
                ) {
                    composable<RouteCategoryListScreen> {
                        CategoryList(
                            onClickCategory = {
                                navController.navigate(RouteLocationListScreen(it.id))
                            }
                        )
                    }

                    composable<RouteLocationListScreen> { backStackEntry ->
                        val route = backStackEntry.toRoute<RouteLocationListScreen>()
                        LocationListScreen(
                            categoryId = route.categoryId,
                            onClickBackNavigation = {
                                navController.popBackStack()
                            },
                            onClickLocation = {
                                navController.navigate(
                                    RouteLocationDetailScreen(
                                        route.categoryId,
                                        it.id
                                    )
                                )
                            }
                        )
                    }

                    composable<RouteLocationDetailScreen> { backStackEntry ->
                        val route = backStackEntry.toRoute<RouteLocationDetailScreen>()
                        LocationDetailScreen(
                            categoryId = route.categoryId,
                            locationId = route.locationId,
                            onClickBackNavigation = {
                                navController.popBackStack()
                            },
                            onClickLocation = {
                                navController.navigate(
                                    RouteLocationDetailScreen(
                                        route.categoryId,
                                        it.id
                                    )
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}

