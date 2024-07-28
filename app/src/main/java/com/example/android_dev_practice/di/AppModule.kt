package com.example.android_dev_practice.di

import com.example.android_dev_practice.ui.page.mainTop.MainTopViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::MainTopViewModel)
}