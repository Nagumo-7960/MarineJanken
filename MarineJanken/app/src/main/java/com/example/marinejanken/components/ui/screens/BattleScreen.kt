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
import kotlin.random.Random

var myHandCheck = ""
var oppHandCheck = ""

@Composable
fun BattleScreen(navController: NavController) {
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
            OppSpeechBalloonCard()
            BeachGirlCard()

            Row {
                JankenCard_Gu(navController)
                JankenCard_Choki(navController)
                JankenCard_Pa(navController)
            }

            MySpeechBalloonCard()
        }

    }

}

fun OppHandCheck() {
    val oppHandList = listOf<String>("gu", "choki", "pa")
    val randOppHandList = Random.nextInt(oppHandList.size)
    oppHandCheck = oppHandList.get(randOppHandList)
}

@Composable
fun BattleBackgroundCard() {
    Image(
        painter = painterResource(id = R.drawable.battle_background),
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
fun OppSpeechBalloonCard() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.opp_speech_balloon),
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
        Text(
            text = "水着のお姉さん「何を出そうかしら...」",
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .padding(
                    bottom = 10.dp
                )
        )
    }

}

@Composable
fun JankenCard_Gu(navController: NavController) {
    Image(
        painter = painterResource(id = R.drawable.janken_gu),
        contentDescription = "jankencard_gu",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(117.dp)
            .width(109.dp)
            .clickable(
                enabled = true,
                onClick = {
                    myHandCheck = "gu"
                    OppHandCheck()
                    BattleResultCheck()
                    navController.navigate("battleResultScreen/gu")
                }
            )

    )
}

@Composable
fun JankenCard_Choki(navController: NavController) {
    Image(
        painter = painterResource(id = R.drawable.janken_choki),
        contentDescription = "jankencard_choki",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(117.dp)
            .width(109.dp)
            .clickable(
                enabled = true,
                onClick = {
                    myHandCheck = "choki"
                    OppHandCheck()
                    BattleResultCheck()
                    navController.navigate("battleResultScreen/choki")
                }
            )
    )
}

@Composable
fun JankenCard_Pa(navController: NavController) {
    Image(
        painter = painterResource(id = R.drawable.janken_pa),
        contentDescription = "jankencard_pa",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(117.dp)
            .width(109.dp)
            .clickable(
                enabled = true,
                onClick = {
                    myHandCheck = "pa"
                    OppHandCheck()
                    BattleResultCheck()
                    navController.navigate("battleResultScreen/pa")
                }
            )

    )
}

@Composable
fun MySpeechBalloonCard() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.my_speech_balloon),
            contentDescription = "my_speech_balloon",
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
        Text(
            text = "どうしよう...",
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .padding(
                    bottom = 10.dp
                )
        )
    }

}

@Preview
@Composable
fun PreviewBattleScreen() {
    val navController = rememberNavController()

    BattleScreen(navController)
}

