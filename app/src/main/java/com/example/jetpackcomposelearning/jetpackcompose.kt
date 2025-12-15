package com.example.jetpackcomposelearning

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun greet(name : String , age:Int , color : Color){
    Text("hello $name your age is $age and color is ${color.toString()}")

}