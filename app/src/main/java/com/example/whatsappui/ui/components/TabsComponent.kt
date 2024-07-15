package com.example.whatsappui.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappui.data.TabData
import com.example.whatsappui.data.tabs
import com.example.whatsappui.ui.theme.WhatsappuiTheme

@Composable
fun TabsComponent(tabIndex: Int, tabs: List<TabData>, onTabClick: (Int) -> Unit) {

    TabRow(
        selectedTabIndex = tabIndex,
        containerColor = MaterialTheme.colorScheme.primary,
        modifier = Modifier.fillMaxWidth(),
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[tabIndex]),
                color = MaterialTheme.colorScheme.tertiary
            )
        }
    ) {

        tabs.forEachIndexed { i, tab ->
            Tab(
                selected = i == tabIndex,
                onClick = { onTabClick(i) },
                modifier = Modifier.padding(vertical = 4.dp),
                selectedContentColor = MaterialTheme.colorScheme.tertiary,
                unselectedContentColor = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.5f),


                ) {
                TabTitle(tab)
            }

        }
    }
}

@Composable
fun TabTitle(tabData: TabData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = tabData.title.value, style = MaterialTheme.typography.bodyLarge)
        tabData.unreadCount?.also {
            CircularCount(value = it.toString())
        }
    }
}


@Preview
@Composable
fun TabsComponentPreview() {
    WhatsappuiTheme {
        TabsComponent(1, tabs, {})
    }

}