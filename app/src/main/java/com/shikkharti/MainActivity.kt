package com.shikkharti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import com.shikkharti.ui.BottomNavigationBar
import com.shikkharti.ui.theme.MyComposeApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
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
