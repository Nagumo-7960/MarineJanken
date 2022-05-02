package com.example.marinejanken.components.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
        Row {
            BackHomeButton(navController = navController)
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
                top = 300.dp
            )
            .height(50.dp)
            .width(120.dp),
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
fun PreviewBattleScreen() {
    val navController = rememberNavController()

    BattleScreen(navController)
}

