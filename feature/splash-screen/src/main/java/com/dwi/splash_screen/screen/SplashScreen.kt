package com.dwi.splash_screen.screen

import android.app.Activity
import android.widget.Toast
import android.window.SplashScreen
import androidx.activity.compose.BackHandler
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.dwi.splash_screen.screen.section.SplashSection

@Composable
internal fun SplashScreen(modifier: Modifier = Modifier) {
    var onBack by remember { mutableIntStateOf(0) }
    val context = LocalContext.current

    BackHandler {
        if (onBack <= 1) (context as Activity).finish()
        onBack += 1
        Toast.makeText(context, "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT).show()
    }

    Surface(
        modifier = modifier,
        color = Color(0xFF01193C),
    ) {
        SplashSection()
    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen()
}