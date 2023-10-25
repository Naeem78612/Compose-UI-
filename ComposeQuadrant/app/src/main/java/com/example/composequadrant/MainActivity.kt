package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DivideScreenIntoFourParts()
                }
            }
        }
    }
}


@Composable
fun DivideScreenIntoFourParts() {

    Column(modifier =Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Row{
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .background(Color(0xFFEADDFF))
                        .fillMaxHeight()


                    )
                {
                    Column ( verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(16.dp)
                        )

                    {
                        Text(text = "Text Composable",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            )
                        Text(text = "Displays text and follows the recommended Material Design guidelines.",
                            modifier = Modifier.padding(top=26.dp)
                        )
                    }
                }

                // Top Right
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .background(Color(0xFFD0BCFF))
                        .weight(1f)
                        .fillMaxHeight()


                    )
                {
                    Column ( verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(16.dp)
                    )

                    {
                        Text(text = "Image Composable",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                        )
                        Text(text = "Creates a composable that lays out and draws a given Painter class object.",
                            modifier = Modifier.padding(top=26.dp)
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)


        ){
            Row{
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .background(Color(0xFFB69DF8))
                        .fillMaxHeight()


                    )
                {
                    Column ( verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(16.dp)
                    )

                    {
                        Text(text = "Row Composable",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                        )
                        Text(text = "A layout composable that places its children in a horizontal sequence.",
                            modifier = Modifier.padding(top=26.dp)
                        )
                    }
                }

                // Top Right
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .background(Color(0xFFF6EDFF))
                        .weight(1f)
                        .fillMaxHeight()


                    )
                {
                    Column ( verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(16.dp)
                    )

                    {
                        Text(text = "Column Composable",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                        )
                        Text(text = "A layout composable that places its children in a vertical sequence.",
                            modifier = Modifier.padding(top=26.dp)
                        )
                    }
                }
            }
        }
    }
}
