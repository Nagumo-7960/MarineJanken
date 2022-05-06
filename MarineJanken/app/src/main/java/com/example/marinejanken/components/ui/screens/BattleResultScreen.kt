package com.example.marinejanken.components.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.marinejanken.R
import com.example.marinejanken.components.ui.screens.BattleScreen

@Composable
fun BattleResultScreen(navController: NavController) {
    Box {
        BattleBackgroundCard()
        Column {
            BackHomeButton(navController = navController)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 70.dp
                )
        ) {
            OptSpeechBalloonCard()
            BeachGirlCard()

            Row {
//                JankenCard_Gu()
//                JankenCard_Choki()
//                JankenCard_Pa()
            }

            MySpeechBalloonCard()
        }

    }

}

@Composable
fun BackToBattleButton(navController: NavController){
    Button(
        onClick = { navController.navigate("homeScreen") },
        modifier = Modifier
            .padding(
                top = 20.dp,
                start = 10.dp
            )
            .height(35.dp)
            .width(84.dp),
        shape = RoundedCornerShape(30),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.White,
            contentColor = Color.Black
        )
    ) {
        Text(
            text = "戻る",
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewBattleRelustScreen() {
    val navController = rememberNavController()

    BattleResultScreen(navController)
}

