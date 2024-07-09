package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.ui.theme.AluveryTheme
import com.example.aluvery.ui.theme.Purple500
import com.example.aluvery.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    ProductItem()
                }
            }
        }
    }
}

@Preview
@Composable
fun ProductItem() {
    Column(
        Modifier
            .height(250.dp)
            .width(200.dp)) {
        Box(modifier = Modifier
            .height(100.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Purple500, Teal200
                    )
                )
            )
            .fillMaxWidth()
        ) {
            Image(painter = painterResource(
                id = R.drawable.ic_launcher_background),
                contentDescription = "imagem do produto",
                Modifier
                    .size(100.dp)
                    .offset(y = 50.dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
                )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = LoremIpsum(50).values.first(),
            fontSize = 18.sp,
            fontWeight = FontWeight(700),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(text = "R$ 14,99",
            fontSize = 14.sp,
            fontWeight = FontWeight(400))
    }
}