package com.nameisjayant.jetpackcomposetutorialsyt.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun MultiHeaderWithLazyColumn() {

    var isShow = remember {
        mutableStateMapOf<String, Boolean>()
    }

    LaunchedEffect(key1 = Unit) {
        isShow = isShow.apply {
            itemList.associate {
                it.type to true
            }.also {
                putAll(it)
            }
        }
    }

    LazyColumn(
        modifier = Modifier.padding(20.dp)
    ) {
        val groupItems = itemList.groupBy { it.type }
        groupItems.forEach { (type, items) ->
            item {
                Row(
                    modifier = Modifier.toggleable(
                        value = isShow[type] == true,
                        onValueChange = {
                            isShow[type] = it
                        },
                        role = Role.Button
                    )
                ) {
                    Row(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = type, style = MaterialTheme.typography.displayLarge.copy(
                                fontWeight = FontWeight.W700,
                                color = Color.Black
                            )
                        )
                        Text(
                            text = "(${items.size})",
                            style = MaterialTheme.typography.displayLarge.copy(
                                color = Color.Black
                            )
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = if (isShow[type] == true) Icons.Default.KeyboardArrowDown else Icons.Default.KeyboardArrowUp,
                            contentDescription = ""
                        )
                    }
                }
            }
            if (isShow[type] == true)
                items(items, key = { it.id }) {
                    Text(text = it.name, modifier = Modifier.padding(vertical = 10.dp))
                }
        }
    }

}

data class Item(
    val id: Int,
    val name: String,
    val type: String
)

val itemList = listOf(
    Item(
        1, "Tiger", "Animal"
    ),
    Item(
        2, "Lion", "Animal"
    ),
    Item(
        3, "Deer", "Animal"
    ),
    Item(
        4, "Lotus", "Flower"
    ),
    Item(
        5, "Sunflower", "Flower"
    ),
    Item(
        6, "Rose", "Flower"
    ),
    Item(
        7, "Table", "Furniture"
    ),
    Item(
        8, "Chair", "Furniture"
    ),
    Item(
        9, "Bed", "Furniture"
    ),
    Item(
        10, "Monkey", "Animal"
    ),
)