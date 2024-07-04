package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposable()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "teste 1")
        Text(text = "teste 2")
    }
}

@Preview(showBackground = true)
@Composable()
fun RowPreview() {
    Row {
       Text(text = "teste 1")
       Text(text = "teste 2")
    }
}

@Preview
@Composable
fun CustomLayoutPreview() {
    Column(Modifier.padding(all = 8.dp).background(color = Color.Blue) ) {
        Text(text = "teste 1")
        Text(text = "teste 2")
        Row(modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp).background(color = Color.Green)) {
            Text(text = "Teste 3")
            Text(text = "Teste 4")
        }
        Box(Modifier.padding(all = 10.dp).background(color= Color.Red)) {
            Row {
                Text(text = "teste 5")
                Text(text = "teste 6")
            }
        }
    }
}

@Composable
fun MyFirstComposable() {
   Text(text = "primeiro texto")
   Text(text = "segundo teste maior")
}
