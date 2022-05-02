package com.example.marinejanken.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marinejanken.R

class MarineJankenHome : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
            ShowHome()
        }
    }

    data class Message(val author: String, val body: String)


    @Preview(
        showBackground = true
    )

    @Composable
    fun Navigation(){
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "showHome") {
            composable("ShowHome") { ShowHome(/*...*/) }
            composable("Battle_1") { Battle_1(/*...*/) }
            /*...*/
        }
    }

    @Composable
    fun ShowHome() {
        Box (){
            SetBackgroundImage()
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ShowTitle()
                StartButton()
            }
        }

    }

    @Composable
    fun SetBackgroundImage() {
        Image(
            painter = painterResource(id = R.drawable.marine_home),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
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
    fun StartButton() {
        val navController = rememberNavController()
        Button(
            onClick = { navController.navigate("Battle_1") },
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
    fun Battle_1(){
        Text(
            text = "画面遷移後"
        )
    }

    @Preview
    @Composable
    fun ComposablePreview() {
        ShowHome()
    }

}
