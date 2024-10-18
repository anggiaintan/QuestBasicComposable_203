package com.example.questbasiccomposable_203

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_203.ui.theme.QuestBasicComposable_203Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_203Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicComposable(modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicComposable(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.ExtraBold
            )
        )
        Text(text = "Ini adalah halaman login")
        Image(
            painter = painterResource(
                id = R.drawable.umy
            ),
            contentDescription = null,
            modifier = Modifier
                .padding(vertical = 50.dp)
                .size(250.dp)
        )
        Text(
            text = "Nama: ",
            style = TextStyle(fontSize = 20.sp)
        )
        Text(
            text = "Anggia Intan Widyaningrum",
            style = TextStyle(
                fontSize = 23.sp,
                fontStyle = FontStyle.Italic,
                color = Color(red = 255, green = 0, blue = 0)
            )
        )
        Text(
            text = "20220140203",
            style = TextStyle(fontSize = 35.sp, fontStyle = FontStyle.Italic)
        )
        Image(
            painter = painterResource(
                id = R.drawable.intan
            ),
            contentDescription = null,
            modifier = Modifier
                .padding(vertical = 20.dp)
                .size(350.dp)
                .clip(CircleShape)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_203Theme {
        BasicComposable()
    }
}