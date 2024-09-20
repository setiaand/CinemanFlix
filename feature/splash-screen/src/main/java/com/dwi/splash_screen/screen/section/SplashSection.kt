package com.dwi.splash_screen.screen.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.dwi.splash_screen.R

@Composable
internal fun SplashSection(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF01193C)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_splash_screen),
            contentDescription = "Splash screen logo",
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun SplashSectionReview() {
    SplashSection()
}