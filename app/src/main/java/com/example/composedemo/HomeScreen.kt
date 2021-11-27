package com.example.composedemo

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Home Screen",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = Bold
            )

            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = {
                navController.navigate(Screen.ProfileScreen.route)
            }) {
                Text(text = "Go to Profile Screen")
            }
        }
    }
}
@Composable
@Preview(showBackground = true,uiMode = UI_MODE_NIGHT_YES)
fun HomeScreenPrev() {
    HomeScreen(navController = rememberNavController())
}