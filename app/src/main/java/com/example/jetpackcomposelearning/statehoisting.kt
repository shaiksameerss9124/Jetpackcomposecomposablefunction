package com.example.jetpackcomposelearning

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun goodtext(text:String , onTextChage:(String) -> Unit){
    TextField(
        value = text,
        onValueChange = onTextChage,
        label = {Text("Enter text")}
    )


}

@Composable
fun parentcomposable(modifier : Modifier = Modifier){
    var text by remember { mutableStateOf("") }
    goodtext(text) {
        text = it
    }
}