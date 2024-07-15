package com.example.whatsappui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun UserImage(userImage:Int) {
    Image(
        painter = painterResource(id = userImage),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier.clip(
            CircleShape
        ).size(40.dp)
    )
}