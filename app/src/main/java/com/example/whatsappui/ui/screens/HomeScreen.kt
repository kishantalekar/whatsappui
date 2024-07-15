package com.example.whatsappui.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsappui.data.tabs
import com.example.whatsappui.ui.components.AppbarComponent
import com.example.whatsappui.ui.components.TabsComponent
import com.example.whatsappui.ui.theme.WhatsappuiTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
    Scaffold(topBar = { AppbarComponent() }) {
        Column(modifier = Modifier.padding(it)) {
            val pagerState = rememberPagerState(pageCount = { tabs.size })
            val coroutineScope = rememberCoroutineScope()
            TabsComponent(tabIndex = pagerState.currentPage, tabs = tabs) { it ->
                coroutineScope.launch {
                    pagerState.animateScrollToPage(
                        it
                    )
                }
            }

            HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.Top) { page ->
                when (page) {
                    0 -> ChatScreen()
                    1 -> StatusScreen()
                    else -> CallScreen()
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    WhatsappuiTheme {
        HomeScreen()
    }

}