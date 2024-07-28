package com.example.android_dev_practice.ui.page.mainTop

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.androidx.compose.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopPage(
    viewModel: MainTopViewModel = koinViewModel()
) {
    val count by viewModel.countState.collectAsState()

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
            Modifier.padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = count.toString())
            Row {
                OutlinedButton(onClick = {
                    viewModel.plusCount()
                }) {
                    Text(text = "+ 1")
                }
                OutlinedButton(onClick = {
                    viewModel.minusCount()
                }) {
                    Text(text = "- 1")
                }
            }
//            TextButton(onClick = { /*TODO*/ }) {
//                Text("Intentを使用した画面遷移")
//            }
//            TextButton(onClick = { /*TODO*/ }) {
//                Text("Navigation Componentを使用した画面遷移")
//            }
        }
    }
}