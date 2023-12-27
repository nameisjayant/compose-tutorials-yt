package com.nameisjayant.jetpackcomposetutorialsyt.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun BaselinePadding() {

    Row(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Text 1", modifier = Modifier.padding(top = 30.dp))
        Text(text = "Text 2", modifier = Modifier.paddingFromBaseline(30.dp))
    }

}