package com.impulse.jetpackcomposeyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.impulse.jetpackcomposeyt.ui.theme.JetPackComposeYTTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			val color = remember{
				mutableStateOf(Color.Yellow)
			}
			Column(Modifier.fillMaxSize()) {
				ColorBox(modifier = Modifier.fillMaxSize().weight(1f)){
					color.value =it
				}
				Box(modifier = Modifier
					.background(color.value)
					.weight(1f)
					.fillMaxSize()
				
				)
			}
		}
	}
}

@Composable
fun ColorBox(modifier: Modifier,
             UpdateColor: (Color)-> Unit
){
	
	val color  = remember {
		mutableStateOf(Color.Red)
	}
	Box(modifier = modifier
		.background(color.value)
		.clickable {
			UpdateColor(Color(
				Random.nextFloat(),
				Random.nextFloat(),
				Random.nextFloat(),
				1f
			))
		}
		
	)
}

