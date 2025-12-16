package com.example.jetpackcomposelearning

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

//read and write in state
@Composable
fun  ToggleExample(){
    var ischecked by remember { mutableStateOf(false) }
    Row(
        verticalAlignment =  Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()

    ) {
        Checkbox(
            checked = ischecked,
            onCheckedChange = {
                ischecked = it
            }
        )

        if (ischecked) {
            Text("checked")
        } else {
            Text("Unchecked")
        }
    }
}
