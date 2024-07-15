package com.example.whatsappui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CircularCount(
    value: String,
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    color: Color = MaterialTheme.colorScheme.primary
) {
    Text(
        text = value,
        style = MaterialTheme.typography.labelMedium,
        color = color,
        modifier = Modifier
            .padding(6.dp)
            .size(18.dp)
            .clip(
                CircleShape
            )
            .background(backgroundColor),
        textAlign = TextAlign.Center

    )
}