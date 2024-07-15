package com.example.whatsappui.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.whatsappui.domain.ChatListDataObject

@Composable
fun UserDetails(chatData: ChatListDataObject) {
    Column(
        modifier = Modifier.wrapContentHeight(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        MessageHeader(chatData = chatData)
        MessageSubHeader(chatData = chatData)

    }
}

@Composable
fun MessageSubHeader(chatData: ChatListDataObject) {
    Row {
        Text(
            text = chatData.message.content,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Black
        )
        Spacer(modifier = Modifier.weight(1f))

        chatData.message.unreadCount?.also {
            CircularCount(
                value = it.toString(),
                color = MaterialTheme.colorScheme.background,
                backgroundColor = MaterialTheme.colorScheme.secondary
            )
        }
    }
}


@Composable
fun MessageHeader(chatData: ChatListDataObject) {
    Row() {
        Text(
            text = chatData.userName,
            style = MaterialTheme.typography.labelLarge,
            color = Color.Black
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = chatData.message.timeStamp,
            style = MaterialTheme.typography.labelMedium,
            color =if(chatData.message.unreadCount == null) Color.Gray else MaterialTheme.colorScheme.primary
        )
    }
}
