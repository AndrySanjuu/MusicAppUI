package com.example.musicappui.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Composable
fun BrowseView(){

    val categories = listOf("Hits2", "Happy2", "Workout2", "Running2", "TGIF2", "Yoga2")

    LazyVerticalGrid(columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.Center){
        items(categories){
            cat ->

            Browsertem(cat = cat, drawable = R.drawable.baseline_music_video_24)

        }
    }

}

@Composable
fun Browsertem(
    cat: String,
    drawable:Int
){
    Card(modifier = Modifier
        .padding(6.dp)
        .size(160.dp),
        border = BorderStroke(3.dp, color = Color.DarkGray)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = cat)
            Image(painter = painterResource(id = drawable), contentDescription = cat)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BrowseViewPrev(){
    BrowseView()
}