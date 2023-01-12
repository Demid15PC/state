package com.example.state

import android.graphics.drawable.VectorDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.state.ui.theme.StateTheme

class MainActivity : ComponentActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
              super.onCreate(savedInstanceState)
              setContent {
                     StateTheme {
                            Card("bfjvsjvuys", "idfgaiuysgdkufgaksdugyf")
                     }
              }
       }
}

@Composable
fun Card(
       title: String,
       subtitle: String
) {
       var expand by remember { mutableStateOf(false) }
       androidx.compose.material.Card(
              modifier = Modifier.fillMaxSize(),
              elevation = 5.dp,
       ) {
              Column(
                     horizontalAlignment = Alignment.CenterHorizontally
              ) {
                     Text(text = title)
                     if (expand){
                            Text(text = subtitle)
                            IconButton(onClick = { expand = false }) {
                                   Icon(Icons.Default.MoreVert, contentDescription = "hfishi")
                            }
                     } else {
                            IconButton(onClick = { expand = true }) {
                                   Icon(Icons.Default.MoreVert, contentDescription = "hfishi")
                            }
                     }
              }
       }
}