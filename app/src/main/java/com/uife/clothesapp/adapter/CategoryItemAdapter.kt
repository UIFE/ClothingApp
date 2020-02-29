package com.uife.clothesapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.uife.clothesapp.R
import com.uife.clothesapp.databinding.CategoryItemLayoutBinding
import com.uife.clothesapp.model.CategoryModel

class CategoryItemAdapter(private val items: List<CategoryModel>): RecyclerView.Adapter<CategoryItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemHolder {
        return CategoryItemHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.category_item_layout,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: CategoryItemHolder, position: Int) {
        holder.binding.item = items[position]
    }
}

class CategoryItemHolder(val binding: CategoryItemLayoutBinding): RecyclerView.ViewHolder(binding.root)