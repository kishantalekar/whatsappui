package com.example.whatsappui.data

data class TabData(val title: Tabs,val unreadCount:Int? = null)

val tabs = listOf(TabData(Tabs.CHATS), TabData(Tabs.STATUS), TabData(Tabs.CALLS,4))

enum class Tabs(val value: String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}