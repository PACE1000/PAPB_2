package com.example.tugas2papb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas2papb.ui.theme.Tugas2PAPBTheme
import java.math.BigDecimal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    var Tinggi by remember {
        mutableStateOf("")
    }

    var Lebar by remember {
        mutableStateOf("")
    }

    var Panjang by remember {
        mutableStateOf("")
    }
    var Hasil by remember{
        mutableStateOf(BigDecimal.ZERO)
    }
    var H = Hasil.toString()

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue), contentAlignment = Alignment.Center){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Arya BramaPUtra \n 21060120120033 \n Pengembangan Aplikasi Perangkat Bergerak",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

            Text(text = "Perhitungan Volume \n V = P X L X T",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Tinggi",
                fontWeight = FontWeight.Bold,
                fontSize =15.sp,
                color = Color.White,
                textAlign = TextAlign.Left )

            TextField(value = Tinggi,
                onValueChange ={Tinggi = it },
                modifier = Modifier.clip(RoundedCornerShape(15.dp)),
                placeholder = { Text(text = "Masukkan Tinggi")},
                label = { Text(text = "Tinggi")})

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Lebar",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.White,
                textAlign = TextAlign.Left)

            TextField(value = Lebar.toString(),
                onValueChange = {Lebar= it},
                modifier = Modifier.clip(RoundedCornerShape(15.dp)),
                placeholder = { Text(text = "Masukkan Lebar")},
                label = { Text(text = "Lebar") })

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Panjang",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.White,
                textAlign = TextAlign.Left)

            TextField(value = Panjang.toString(),
                onValueChange = {Panjang= it},
                modifier = Modifier.clip(RoundedCornerShape(15.dp)),
                placeholder = { Text(text = "Masukkan Panjang")},
                label = { Text(text = "Panjang")})

            Button(onClick = {
                val P = Panjang.toBigDecimalOrNull()?: BigDecimal.ZERO
                val L = Lebar.toBigDecimalOrNull()?: BigDecimal.ZERO
                val T = Tinggi.toBigDecimalOrNull()?:BigDecimal.ZERO
                Hasil = P * L * T
            }) {
                Text(text = "Hasil", color = Color.White)
            }
            Text(text = "Hasil",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Left)

            Text(text = H,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Left)

        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen(){
    Tugas2PAPBTheme {
        HomeScreen()
    }
}