package com.example.marinejanken.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.marinejanken.components.ui.screens.BattleScreen
import com.example.marinejanken.components.ui.screens.HomeScreen
import com.example.marinejanken.components.ui.screens.BattleResultScreen


@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen") {
        composable("homeScreen") { HomeScreen(navController) }
        composable("battleScreen") { BattleScreen(navController) }
        composable(
            "battleResultScreen/{handId}",
            arguments = listOf(
                navArgument("handId"){type = NavType.StringType}
            )
        ){ BattleResultScreen(navController)}
        /*...*/
    }
}