package com.example.android_dev_practice.ui.page.mainTop

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopPage() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("Android Dev Practice")
                },
                modifier = Modifier
                    .displayCutoutPadding()
            )
        }
    ) { innerPadding ->
        Column(
            Modifier.padding(innerPadding)
        ) {
            TextButton(onClick = { /*TODO*/ }) {
                Text("Intentを使用した画面遷移")
            }
            TextButton(onClick = { /*TODO*/ }) {
                Text("Navigation Componentを使用した画面遷移")
            }
        }
    }
}