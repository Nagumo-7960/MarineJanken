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

var battleResult = ""
val oppResultPhrase = listOf<String>(
    "私の勝ちね・・・",
    "あいこね・・・",
    "私の負けね・・・"
)
val myResultPhrase = listOf<String>(
    "勝った！",
    "もう1回！",
    "負けちゃった・・・"
)

@Composable
fun BattleResultScreen(navController: NavController, myHand: String?) {
    Box {
        BattleBackgroundCard()
        Column {
            BackToBattleButton(navController = navController)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 70.dp
                )
        ) {
            OppSpeechResultBalloonCard()

            Box {
                BeachGirlCard()
                OppHandCard()
            }

            MyHandCard()
            MySpeechResultBalloonCard()
        }

    }

}

fun BattleResultCheck() {
    if (myHandCheck == "gu") {
        if (oppHandCheck == "gu") {
            battleResult = "draw"
        }
        if (oppHandCheck == "choki") {
            battleResult = "win"
        }
        if (oppHandCheck == "pa") {
            battleResult = "lose"
        }
    }

    if (myHandCheck == "choki") {
        if (oppHandCheck == "gu") {
            battleResult = "lose"
        }
        if (oppHandCheck == "choki") {
            battleResult = "draw"
        }
        if (oppHandCheck == "pa") {
            battleResult = "win"
        }

    }

    if (myHandCheck == "pa") {
        if (oppHandCheck == "gu") {
            battleResult = "win"
        }
        if (oppHandCheck == "choki") {
            battleResult = "lose"
        }
        if (oppHandCheck == "pa") {
            battleResult = "draw"
        }
    }
}

@Composable
fun BackToBattleButton(navController: NavController) {
    Button(
        onClick = { navController.popBackStack() },
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
fun OppSpeechResultBalloonCard() {
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
        when (battleResult) {
            "win" ->
                Text(
                    text = oppResultPhrase.get(2),
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .padding(
                            bottom = 10.dp
                        )
                )
            "draw" ->
                Text(
                    text = oppResultPhrase.get(1),
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .padding(
                            bottom = 10.dp
                        )
                )
            "lose" ->
                Text(
                    text = oppResultPhrase.get(0),
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .padding(
                            bottom = 10.dp
                        )
                )
        }

    }

}

@Composable
fun MySpeechResultBalloonCard() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.my_speech_balloon),
            contentDescription = "speech_result_balloon",
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
        when (battleResult) {
            "win" ->
                Text(
                    text = myResultPhrase.get(0),
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .padding(
                            bottom = 10.dp
                        )
                )
            "draw" ->
                Text(
                    text = myResultPhrase.get(1),
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .padding(
                            bottom = 10.dp
                        )
                )
            "lose" ->
                Text(
                    text = myResultPhrase.get(2),
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .padding(
                            bottom = 10.dp
                        )
                )
        }

    }

}

@Composable
fun OppHandCard() {
    when (oppHandCheck) {
        "gu" ->
            Image(
                painter = painterResource(id = R.drawable.janken_gu),
                contentDescription = "opp_hand_card",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .absoluteOffset(
                        y = 100.dp
                    )
                    .height(117.dp)
                    .width(109.dp)
            )
        "choki" ->
            Image(
                painter = painterResource(id = R.drawable.janken_choki),
                contentDescription = "opp_hand_card",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .absoluteOffset(
                        y = 100.dp
                    )
                    .height(117.dp)
                    .width(109.dp)
            )
        "pa" ->
            Image(
                painter = painterResource(id = R.drawable.janken_pa),
                contentDescription = "opp_hand_card",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .absoluteOffset(
                        y = 100.dp
                    )
                    .height(117.dp)
                    .width(109.dp)
            )
    }

}

@Composable
fun MyHandCard() {
    when (myHandCheck) {
        "gu" ->
            Image(
                painter = painterResource(id = R.drawable.janken_gu),
                contentDescription = "my_hand_card",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(117.dp)
                    .width(109.dp)
            )
        "choki" ->
            Image(
                painter = painterResource(id = R.drawable.janken_choki),
                contentDescription = "my_hand_card",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(117.dp)
                    .width(109.dp)
            )
        "pa" ->
            Image(
                painter = painterResource(id = R.drawable.janken_pa),
                contentDescription = "my_hand_card",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(117.dp)
                    .width(109.dp)
            )
    }
}


@Preview
@Composable
fun PreviewBattleResultScreen() {
    val navController = rememberNavController()

    BattleResultScreen(navController,"gu")
}

