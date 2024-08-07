package com.example.kotlin_spotify_random_like_app.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.kotlin_spotify_random_like_app.model.data.ItemModel

class CardStackCallback(private val oldList: List<ItemModel>, private val newList: List<ItemModel>): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].image == newList[newItemPosition].image
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}