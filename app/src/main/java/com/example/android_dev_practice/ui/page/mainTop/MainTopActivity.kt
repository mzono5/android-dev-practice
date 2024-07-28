package com.example.android_dev_practice.ui.page.mainTop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.android_dev_practice.ui.theme.AndroiddevpracticeTheme

class MainTopActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            AndroiddevpracticeTheme {
                MainTopPage()
            }
        }
    }
}