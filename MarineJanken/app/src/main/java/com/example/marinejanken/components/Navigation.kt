package com.example.marinejanken.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marinejanken.components.ui.screens.BattleScreen
import com.example.marinejanken.components.ui.screens.HomeScreen


@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen") {
        composable("homeScreen") { HomeScreen(navController) }
        composable("battleScreen") { BattleScreen(navController) }
        /*...*/
    }
}