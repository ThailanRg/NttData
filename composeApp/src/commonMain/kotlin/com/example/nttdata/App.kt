package com.example.nttdata

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import com.example.nttdata.navigation.AppNavigator
import com.example.nttdata.navigation.Screen
import com.example.nttdata.navigation.rememberAppNavigator
import com.example.nttdata.ui.NewsDetailScreen
import com.example.nttdata.ui.NewsListScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navigator = rememberAppNavigator()
        
        AppContent(navigator = navigator)
    }
}

@Composable
fun AppContent(navigator: AppNavigator) {
    when (val currentScreen = navigator.currentScreen) {
        is Screen.NewsList -> {
            NewsListScreen(
                onNewsClick = { newsId ->
                    navigator.navigateTo(Screen.NewsDetail(newsId))
                }
            )
        }
        is Screen.NewsDetail -> {
            NewsDetailScreen(
                newsId = currentScreen.newsId,
                onBackClick = {
                    navigator.navigateTo(Screen.NewsList)
                }
            )
        }
    }
}