package ir.mjkhaani.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldUi()
        }
    }
}



@Composable
fun HelloWorldUi() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.happy_meal_small),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.height(300.dp)
        )
        Column(modifier = Modifier.padding(all = 16.dp)) {
            Text(
                text = "Happy Meal",
                style = TextStyle(fontSize = 27.sp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "800 Calories",
                style = TextStyle(fontSize = 16.sp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "$5.99",
                color = Color(0xFF85bb65),
                style = TextStyle(fontSize = 16.sp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewUI() {
    HelloWorldUi()
}
