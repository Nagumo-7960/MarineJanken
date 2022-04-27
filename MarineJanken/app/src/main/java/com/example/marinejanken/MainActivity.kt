package com.example.marinejanken

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Counter()
        }
    }

    data class Message(val author: String, val body: String)

    @Composable
    fun MessageCard(msg: Message) {
        Row {
            androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.marine),
                contentDescription = "Content profile picture"
            )

        }
        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }

    @Composable
    fun Message2(username: String, body: String) {
        Column {
            MyButton()
            Row {
                Icon(Icons.Default.Person, contentDescription = null)
                Text(text = username)
            }
            Text(text = body)
        }
    }

    @Composable
    fun Greeting() {
        Text(
            text = "Hello, world!",
            modifier = Modifier
                .clickable { }
                .background(color = Color.Gray)
                .border(2.dp, Color.Red)
                .padding(8.dp)
        )
    }

    @Composable
    fun MyButton() {
        Button(
            onClick = { println("Hello, world!") }
        ) {
            Text(text = "Click")
        }
    }

    @Composable
    fun Counter() {
        var count by remember { mutableStateOf(0) }
        Column (                modifier = Modifier
            .fillMaxSize()){
            Text(
                text = "Count:$count",

                )
            Button(
                onClick = { count++ }
            ) {
                Text(text = "Click")
            }
        }
    }


    @Preview(
        showBackground = true
    )
    @Composable
    fun PreviewMessageCard() {
//    MessageCard(
//        msg = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
//    )
//    Message2(username = "Hello", body = "Android")
        Counter()
    }
}