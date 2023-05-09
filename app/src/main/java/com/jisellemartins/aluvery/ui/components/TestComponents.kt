package com.jisellemartins.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jisellemartins.aluvery.ui.theme.AluveryTheme

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text("Texto 1")
        Text("Texto 2")
    }
    Text(text = "Texto 3")

}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row() {
        Text("Texto 1")
        Text("Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box() {
        Text("Texto 1")
        Text("Texto 2")
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
            .padding(all = 8.dp)
            .background(color = Color.Blue)
            .padding(all = 8.dp)
            .fillMaxWidth()
            .fillMaxHeight()) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")

        Row(modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 16.dp)
            .background(Color.Green)
            .fillMaxWidth(0.9f)) {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box(
            Modifier
                .padding(all = 8.dp)
                .background(color = Color.Red)
                .padding(all = 8.dp)) {
            Row(
                Modifier
                    .padding(all = 8.dp)
                    .background(color = Color.Cyan)
                    .padding(all = 8.dp)) {
                Text("Texto 5")
                Text("Texto 6")
            }
            Column(
                Modifier
                    .padding(all = 8.dp)
                    .background(color = Color.Yellow)
                    .padding(all = 8.dp)) {
                Text("Texto 7")
                Text("Texto 8")
            }
        }
    }
}
@Composable
fun MyFirstComposable(){
    Text("Meu primeiro texto")
    Text("Meu segundo texto maior")
}
@Preview(showBackground = true,  backgroundColor = 0xFFFFFFFF)
@Composable
fun MyFirstComposablePreview(){

    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}