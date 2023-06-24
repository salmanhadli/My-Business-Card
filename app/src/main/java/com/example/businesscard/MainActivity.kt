package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinessCard()
                }
            }
        }
    }
}

@Composable
fun BussinessCard(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(Color(0xFFd2e8d4))
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth().weight(1f),
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp)
                    .width(150.dp)
                    .background(Color(0xFF073042))
                    .clip(RoundedCornerShape(8.dp))
            )
            Text(
                text = stringResource(id = R.string.user_name),
                fontSize = 32.sp,
                fontWeight = FontWeight.Light,
                color = Color(0xFF425345),
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = stringResource(id = R.string.user_role),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0XFF468e66)
            )
        }

        Column(
            modifier = Modifier
                .padding(bottom = 28.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 80.dp)
            ) {
                val icon = painterResource(id = R.drawable.ic_call)
                Image(painter = icon, contentDescription = null)
                Text(
                    text = stringResource(R.string.user_contact),
                    modifier = Modifier.padding(start = 25.dp),
                    color = Color(0xFF425345)
                )
            }
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 80.dp, top = 12.dp)
            ) {
                val icon = painterResource(id = R.drawable.ic_share)
                Image(painter = icon, contentDescription = null)
                Text(
                    text = stringResource(R.string.user_share),
                    modifier = Modifier.padding(start = 25.dp),
                    color = Color(0xFF425345)
                )
            }
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 80.dp, top = 12.dp)
            ) {
                val icon = painterResource(id = R.drawable.ic_email)
                Image(painter = icon, contentDescription = null)
                Text(
                    text = stringResource(R.string.user_email),
                    modifier = Modifier.padding(start = 25.dp),
                    color = Color(0xFF425345)
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BussinessCard()
    }
}