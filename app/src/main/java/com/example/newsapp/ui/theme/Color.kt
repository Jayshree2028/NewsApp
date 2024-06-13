package com.example.newsapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF1A7AC5)
val PurpleGrey40 = Color(0xFF625b71)

//val BlueGray = Color(0xFF7B7686)
val Pink40 = Color(0xFF7D5260)

val Black = Color(0xFF1C1E21)
val Blue = Color(0xFF1877F2)
val DarkRed = Color(0xFFC30052)
val LightRed = Color(0xFFFF8487)
val LightBlack = Color(0xFF3A3B3C)
val BlueGray = Color(0xFFA0A3BD)
val WhiteGray = Color(0xFFB0B3B8)


val cardColor: Any
    @Composable
    get()  {
        return if (isSystemInDarkTheme()) Color.Black else Color.White
    }