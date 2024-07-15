package com.example.whatsappui.data

import androidx.annotation.DrawableRes
import com.example.whatsappui.R
import com.example.whatsappui.domain.ChatListDataObject
import com.example.whatsappui.domain.Message
import com.example.whatsappui.domain.MessageDeliveryStatus
import com.example.whatsappui.domain.MessageType


val dummyChatListData = listOf(
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Hey, what's up?",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            type = MessageType.TEXT,
            timeStamp = "15:30"
        ),
        userName = "Alice",
        userImage = R.drawable.avatar_0, // Replace with actual image URL
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "Check out this song!",
            deliveryStatus = MessageDeliveryStatus.READ,
            type = MessageType.AUDIO,
            timeStamp = "12:45",
            unreadCount = 4
        ),
        userName = "Bob",
        userImage = R.drawable.avatar_1,
    ),
    ChatListDataObject(
        chatId = 3,
        message = Message(
            content = "",
            deliveryStatus = MessageDeliveryStatus.PENDING,
            type = MessageType.IMAGE,
            timeStamp = "Yesterday",
            unreadCount = 6
        ),
        userName = "Charlie",
        userImage = R.drawable.avatar_2,
    ),
    ChatListDataObject(
        chatId = 4,
        message = Message(
            content = "I'm running late, sorry!",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            type = MessageType.TEXT,
            timeStamp = "10:15"
        ),
        userName = "David",
        userImage = R.drawable.avatar_3,
    ),
    ChatListDataObject(
        chatId = 5,
        message = Message(
            content = "Meet me here: https://support.google.com/maps/answer/18539?hl=en&co=GENIE.Platform%3DDesktop",
            deliveryStatus = MessageDeliveryStatus.READ,
            type = MessageType.LOCATION,
            timeStamp = "09:30"
        ),
        userName = "Emily",
        userImage =R.drawable.avatar_4,
    )
)

