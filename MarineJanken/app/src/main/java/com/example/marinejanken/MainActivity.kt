package com.example.marinejanken

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
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
            .clickable {  }
            .background(color = Color.Gray)
            .border(2.dp, Color.Red)
            .padding(8.dp)

    )
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
    Greeting()
}