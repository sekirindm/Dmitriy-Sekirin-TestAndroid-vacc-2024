package com.example.premierconsultproject.presentation

import com.example.premierconsultproject.data.network.model.Products

sealed class ItemsList {

    data class ProductsItemList(val products: Products) : ItemsList()

}
