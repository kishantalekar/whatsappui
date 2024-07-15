package com.example.whatsappui.domain

import androidx.annotation.DrawableRes

data class ChatListDataObject(
    val chatId: Int,
    val message: Message,
    val userName: String,
    @DrawableRes val userImage: Int
)

data class Message(
    val content: String,
    val deliveryStatus: MessageDeliveryStatus,
    val type: MessageType,
    val timeStamp: String,
    val unreadCount:Int?=null
)

enum class MessageType {
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE,
    LOCATION
}

enum class MessageDeliveryStatus {
    DELIVERED,
    READ,
    ERROR,
    PENDING,
}