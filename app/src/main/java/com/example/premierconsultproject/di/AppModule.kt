package com.example.premierconsultproject.di

import com.example.premierconsultproject.data.network.common.Constants.retrofitService
import com.example.premierconsultproject.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModel = module {
    viewModel {
        MainViewModel(get())
    }

}
val networkModule = module {
    single {
        retrofitService
    }
}