package com.example.batterymanager.home

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CircleIndicator() {
    Canvas(
        modifier = Modifier
            .size(180.dp)
            .background(Color.Gray),
    ) {
        val cx = size.width / 2f
        val cy = size.height / 2f
        val radius = size.width / 2f

        drawCircle(color = Color.Green, radius = radius, center = Offset(cx, cy))
    }
}
