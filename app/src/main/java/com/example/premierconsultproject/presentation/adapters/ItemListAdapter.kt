package com.example.premierconsultproject.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.premierconsultproject.R
import com.example.premierconsultproject.data.network.model.Products
import com.example.premierconsultproject.presentation.ItemsList
import com.example.premierconsultproject.presentation.ListDiffUtils
import com.squareup.picasso.Picasso

class ItemListAdapter(val handleWords: (productId: Products) -> Unit) : ListAdapter<ItemsList, RecyclerView.ViewHolder>(ListDiffUtils) {

    override fun getItemViewType(position: Int): Int {
        return when {
            getItem(position) is ItemsList.ProductsItemList -> 0
            else -> {
                1
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return ItemListViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ItemListViewHolder -> {
                val item = getItem(position) as ItemsList.ProductsItemList
                holder.bind(item.products)
            }
        }
    }
    inner class ItemListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvTitle : TextView = view.findViewById(R.id.tv_title)
        private val tvPrice : TextView = view.findViewById(R.id.tv_price)
        private val tvRating : TextView = view.findViewById(R.id.tv_rating)
        private val ivImage : ImageView = view.findViewById(R.id.iv_image)


        fun bind(products: Products) {

            tvTitle.text = products.title
            tvPrice.text = products.price.toString() + "$"
            tvRating.text = products.rating.rate.toString()
            Picasso.with(itemView.context).load(products.image).into(ivImage)

            itemView.setOnClickListener {
                handleWords(products)
            }
        }
    }

}