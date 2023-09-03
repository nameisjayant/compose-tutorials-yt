package com.nameisjayant.jetpackcomposetutorialsyt.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role


@Composable
fun ToggleableModifierExample() {

    var isChecked by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .toggleable(
                    value = isChecked,
                    onValueChange = {
                        isChecked = it
                    },
                    role = Role.Checkbox,
                    indication = null,
                    interactionSource = MutableInteractionSource()
                )
        ) {
            Text(text = "CheckBox", modifier = Modifier.weight(1f))
            Checkbox(checked = isChecked, onCheckedChange = null)
        }

    }

}