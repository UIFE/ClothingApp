package com.uife.clothesapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.uife.clothesapp.R
import com.uife.clothesapp.databinding.MenuItemLayoutBinding
import com.uife.clothesapp.model.ItemModel

class ItemAdapter(private val items: List<ItemModel>): RecyclerView.Adapter<ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.menu_item_layout,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.binding.item = items[position]
    }
}

class ItemHolder(val binding: MenuItemLayoutBinding): RecyclerView.ViewHolder(binding.root)