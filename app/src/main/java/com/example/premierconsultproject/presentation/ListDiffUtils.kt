package com.example.premierconsultproject.presentation

import androidx.recyclerview.widget.DiffUtil

object ListDiffUtils : DiffUtil.ItemCallback<ItemsList>() {

    override fun areItemsTheSame(oldItem: ItemsList, newItem: ItemsList): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ItemsList, newItem: ItemsList): Boolean {
        return newItem == oldItem
    }
}