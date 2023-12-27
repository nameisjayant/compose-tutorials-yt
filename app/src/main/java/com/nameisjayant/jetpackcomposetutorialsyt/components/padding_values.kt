package com.nameisjayant.jetpackcomposetutorialsyt.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaddingValuesExample() {

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "APP Title")
            })
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Blue
            ) {

            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()) {
            LazyColumn {
                items(50) {
                    Text(text = "Text $it", modifier = Modifier.padding(5.dp))
                }
            }
            FloatingActionButton(onClick = {}, modifier = Modifier.align(Alignment.BottomEnd)) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        }
    }

}