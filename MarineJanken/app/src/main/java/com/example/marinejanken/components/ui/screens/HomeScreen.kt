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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.marinejanken.R

@Composable
fun HomeScreen(navController: NavController) {
    Box {
        HomeImageCard()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ShowTitle()
            StartButton(navController = navController)
        }
    }
}


@Composable
fun ShowTitle() {
    Text(
        text = "うみべのじゃんけん",
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 120.dp
            ),

        Color.White,
        fontSize = 33.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun StartButton(navController: NavController) {
    Button(
        onClick = { navController.navigate("battleScreen") },
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
            text = "スタート",
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun HomeImageCard() {
    Image(
        painter = painterResource(id = R.drawable.marine_home),
        contentDescription = "Background",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

