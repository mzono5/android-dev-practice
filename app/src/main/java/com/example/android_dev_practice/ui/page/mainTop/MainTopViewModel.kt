package com.example.android_dev_practice.ui.page.mainTop

import androidx.lifecycle.ViewModel
import com.example.android_dev_practice.ui.page.mainTop.listener.CounterListener
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainTopViewModel : ViewModel(), CounterListener {

    private val _countState = MutableStateFlow(0)
    val countState = _countState.asStateFlow()

    override fun plusCount() {
        _countState.update { it + 1 }
    }

    override fun minusCount() {
        _countState.update { it - 1 }
    }
}