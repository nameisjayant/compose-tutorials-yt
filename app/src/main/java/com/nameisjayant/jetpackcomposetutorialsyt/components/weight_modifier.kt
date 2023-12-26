package com.nameisjayant.jetpackcomposetutorialsyt.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun WeightModifierExampleOne() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            // horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Hello bjhdd jkjkdd nnjknd njndd nnnnnd njddj nnnd n",
                modifier = Modifier.weight(
                    1f
                )
            )
            Spacer(
                modifier = Modifier
                    .background(Color.Red, CircleShape)
                    .size(50.dp)
            )
        }
    }

}

@Composable
fun WeightModifierExampleTwo() {

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = {}, modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f)
            ) {
                Text(text = "Button one")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = {}, modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f)
            ) {
                Text(text = "Button two")
            }
        }
    }

}

@Composable
fun WeightModifierExampleThree() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(50) {
                Text(text = "Text $it", modifier = Modifier.padding(10.dp))
            }
        }

        Button(onClick = {}, modifier = Modifier.padding(20.dp).fillMaxWidth()) {
            Text(text = "Get Started")
        }

    }
}