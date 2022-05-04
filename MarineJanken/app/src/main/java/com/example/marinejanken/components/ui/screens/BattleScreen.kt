package com.example.marinejanken.components.ui.screens

import androidx.compose.foundation.Image
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

@Composable
fun BattleScreen(navController: NavController) {
    Box {
        BattleImageCard_1()
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
            SpeechBalloonCard()
            BeachGirlCard()

            Row() {
                JankenCard_Gu()
                JankenCard_Choki()
                JankenCard_Pa()
            }

            MySpeechBalloonCard()
        }

    }

}

@Composable
fun BattleImageCard_1() {
    Image(
        painter = painterResource(id = R.drawable.marine_battle_field),
        contentDescription = "Background",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun BackHomeButton(navController: NavController) {
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

@Composable
fun BeachGirlCard() {
    Image(
        painter = painterResource(id = R.drawable.girl_01),
        contentDescription = "girl",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(252.dp)
            .width(94.dp)
    )
}

@Composable
fun SpeechBalloonCard() {
    Image(
        painter = painterResource(id = R.drawable.speech_balloon),
        contentDescription = "speech_balloon",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxWidth()
            .height(108.dp)
            .width(287.dp)
            .padding(
                start = 50.dp,
                end = 50.dp
            )
    )
}

@Composable
fun JankenCard_Gu() {
    Image(
        painter = painterResource(id = R.drawable.gu),
        contentDescription = "speech_balloon",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(117.dp)
            .width(109.dp)
    )
}

@Composable
fun JankenCard_Choki() {
    Image(
        painter = painterResource(id = R.drawable.choki),
        contentDescription = "speech_balloon",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(117.dp)
            .width(109.dp)
    )
}

@Composable
fun JankenCard_Pa() {
    Image(
        painter = painterResource(id = R.drawable.pa),
        contentDescription = "speech_balloon",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(117.dp)
            .width(109.dp)

    )
}

@Composable
fun MySpeechBalloonCard() {
    Image(
        painter = painterResource(id = R.drawable.myballoon),
        contentDescription = "speech_balloon",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxSize()
            .height(158.dp)
            .width(287.dp)
            .padding(
                top = 50.dp,
                start = 50.dp,
                end = 50.dp,
                bottom = 50.dp
            )
    )
}

@Preview
@Composable
fun PreviewBattleScreen() {
    val navController = rememberNavController()

    BattleScreen(navController)
}

