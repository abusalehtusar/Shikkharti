package com.shikkharti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.shikkharti.ui.theme.MyComposeApplicationTheme
import androidx.compose.material3.Scaffold
import com.shikkharti.ui.BottomNavigationBar

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApplicationTheme {
                Scaffold(
                    bottomBar = { BottomNavigationBar() }
                ) {
                    // Screen content goes here
                }
            }
        }
    }
}