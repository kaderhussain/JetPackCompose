package com.impulse.jetpackcomposeyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.impulse.jetpackcomposeyt.ui.theme.JetPackComposeYTTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			LazyColumn{
				items(500){
					Text(
						text="Item $it",
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold,
						textAlign =  TextAlign.Center,
						modifier = Modifier
							.fillMaxWidth()
							.padding(vertical = 24.dp)
						
					)
				}
			}
		}
	}
}

