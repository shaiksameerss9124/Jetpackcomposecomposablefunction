package com.example.jetpackcomposelearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun coloumnlayout() {

    Column(modifier = Modifier.background(color = Color.Green).fillMaxSize() , horizontalAlignment =  Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center ) {
    Text("Hello Dosto")
    Text("Hi sameer")
        Button(onClick = {}) {
            Text("Something" , color= Color.Green)
        }
}

}

@Composable
@Preview(showSystemUi = true)
fun colomnlayputexample(modifier: Modifier = Modifier){
    coloumnlayout()
}