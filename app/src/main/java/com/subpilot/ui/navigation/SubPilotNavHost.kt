package com.geekneuron.subpilot.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.geekneuron.subpilot.ui.screen.EditorScreen

@Composable
fun SubPilotNavHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "editor",
        modifier = modifier
    ) {
        composable("editor") { EditorScreen() }
    }
}
