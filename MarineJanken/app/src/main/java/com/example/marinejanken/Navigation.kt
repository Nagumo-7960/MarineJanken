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
import com.example.marinejanken.ui.screens.SettingScreen


@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen") {
        composable("homeScreen") {
                HomeScreen(
                    toBattle = {navController.navigate("battleScreen")},
                    toSetting = {navController.navigate("settingScreen")}
                )

        }
        composable("settingScreen"){
            SettingScreen()
        }

        composable("battleScreen") {
            BattleScreen(
                toHome = {navController.navigate("home")},
                toResult = {navController.navigate("battleResultScreen/{handId}")}
            )
        }
        composable(
            "battleResultScreen/{handId}",
            arguments = listOf(
                navArgument("handId"){type = NavType.StringType}
            )
        ){ backStackEntry ->
            BattleResultScreen(navController, backStackEntry.arguments?.getString("handId"))
        }
        /*...*/
    }
}