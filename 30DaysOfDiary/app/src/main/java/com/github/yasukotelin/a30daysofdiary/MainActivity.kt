package com.github.yasukotelin.a30daysofdiary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.github.yasukotelin.a30daysofdiary.ui.theme.A30DaysOfDiaryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            A30DaysOfDiaryTheme {
                MainScreen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}