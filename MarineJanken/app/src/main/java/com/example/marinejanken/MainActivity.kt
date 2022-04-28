package com.example.marinejanken

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setBackgroundImage()
        }
    }

    data class Message(val author: String, val body: String)


    @Preview(
        showBackground = true
    )

    @Composable
    fun setBackgroundImage() {
        Image(
            painter = painterResource(id = R.drawable.marine_home),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
    }

    @Preview
    @Composable
    fun ComposablePreview() {
        setBackgroundImage()
    }

}
