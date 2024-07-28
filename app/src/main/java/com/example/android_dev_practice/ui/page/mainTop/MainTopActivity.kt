package com.example.android_dev_practice.ui.page.mainTop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.android_dev_practice.ui.theme.AndroiddevpracticeTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainTopActivity : ComponentActivity() {

    private val viewModel: MainTopViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            AndroiddevpracticeTheme {
                MainTopPage(
                    viewModel = viewModel
                )
            }
        }
    }
}