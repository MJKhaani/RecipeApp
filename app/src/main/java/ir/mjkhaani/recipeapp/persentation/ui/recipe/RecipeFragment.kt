package ir.mjkhaani.recipeapp.persentation.ui.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import ir.mjkhaani.recipeapp.R

@AndroidEntryPoint
class RecipeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                HelloWorldUi()
            }
        }
    }
}

@Composable
fun HelloWorldUi() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(color = Color(0xFFF2F2F2))
    ) {
        Image(
            painter = painterResource(id = R.drawable.happy_meal_small),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier
                .padding(all = 16.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Happy Meal",
                    style = TextStyle(fontSize = 27.sp)
                )
                Text(
                    text = "$5.99",
                    color = Color(0xFF85bb65),
                    style = TextStyle(fontSize = 16.sp)
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = "800 Calories",
                style = TextStyle(fontSize = 16.sp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Button(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text(text = "Order now")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewUI() {
    HelloWorldUi()
}