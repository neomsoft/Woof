package io.neomsoft.woof

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.neomsoft.woof.ui.screens.main.MainScreen
import io.neomsoft.woof.ui.theme.WoofTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WoofTheme {
                MainScreen()
            }
        }
    }
}