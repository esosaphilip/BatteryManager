package com.example.batterymanager.home // ktlint-disable filename

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BatteryScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color.Black),
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun BatteryScreenPreview() {
    BatteryScreen()
}
