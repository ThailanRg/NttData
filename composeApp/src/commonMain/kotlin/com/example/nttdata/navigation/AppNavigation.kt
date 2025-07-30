package com.example.nttdata.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.nttdata.model.News

sealed class Screen {
    data object NewsList : Screen()
    data class NewsDetail(val newsId: Int) : Screen()
}

class AppNavigator {
    var currentScreen by mutableStateOf<Screen>(Screen.NewsList)
        private set

    fun navigateTo(screen: Screen) {
        currentScreen = screen
    }
}

@Composable
fun rememberAppNavigator(): AppNavigator {
    return remember { AppNavigator() }
}