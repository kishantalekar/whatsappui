package com.example.whatsappui.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappui.data.dummyChatListData
import com.example.whatsappui.domain.ChatListDataObject
import com.example.whatsappui.ui.components.UserDetails
import com.example.whatsappui.ui.components.UserImage
import com.example.whatsappui.ui.theme.WhatsappuiTheme

@Composable
fun ChatScreen() {
//    Text(text = "chat screen", style = TextStyle(color = MaterialTheme.colorScheme.primary))
    LazyColumn(
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        item { Spacer(modifier = Modifier.height(4.dp)) }
        items(items = dummyChatListData, key = { chat -> chat.chatId }) { chat ->
            ChatCard(chatData = chat)
        }
    }
}

@Composable
fun ChatCard(chatData: ChatListDataObject, modifier: Modifier = Modifier) {
    Row(
        modifier
            .padding(vertical = 4.dp)

            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(25.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        UserImage(userImage = chatData.userImage)
        UserDetails(chatData)

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ChatScreenPreview() {
    WhatsappuiTheme {
        ChatScreen()
    }
}