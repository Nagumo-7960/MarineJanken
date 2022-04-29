package com.example.marinejanken

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowHome()
        }
    }

    data class Message(val author: String, val body: String)


    @Preview(
        showBackground = true
    )

    @Composable
    fun ShowHome() {
        Box {
            SetBackgroundImage()
            ShowTitle()
            StartButton()
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
        Button(onClick = { /*TODO*/ }) {
            Text(
                text = "スタート"
            )
        }
    }

    @Preview
    @Composable
    fun ComposablePreview() {
        ShowHome()
    }

}
