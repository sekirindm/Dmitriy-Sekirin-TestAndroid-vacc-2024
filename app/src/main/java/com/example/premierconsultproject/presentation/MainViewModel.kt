package com.example.premierconsultproject.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.premierconsultproject.data.network.model.Products
import com.example.premierconsultproject.data.network.service.RetrofitService
import kotlinx.coroutines.launch

class MainViewModel(private val retrofitService: RetrofitService) : ViewModel() {

    private val _products = MutableLiveData<List<Products>>()
    val products: LiveData<List<Products>> get() = _products

    fun fetchData() {
        viewModelScope.launch {
            try {
                val response = retrofitService.getRequest()
                _products.value = response
            } catch (_: Exception) {
            }
        }
    }
}