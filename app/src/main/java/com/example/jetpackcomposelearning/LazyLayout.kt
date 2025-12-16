package com.example.jetpackcomposelearning

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun lazylayout() {
    LazyRow {
        items(count =100){
            index ->
            Text("Item$index" , modifier = Modifier.padding(8.dp) )
        }
    }
    
}
@Composable
@Preview
fun lazylayoutpreview(){
    lazylayout()
}