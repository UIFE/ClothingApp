package com.uife.clothesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.uife.clothesapp.adapter.CategoryItemAdapter
import com.uife.clothesapp.adapter.ItemAdapter
import com.uife.clothesapp.data.AdapterData
import com.uife.clothesapp.databinding.ActivityMainBinding
import com.uife.clothesapp.utils.changeBarColor

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.categoryLayout.categoryList.adapter = CategoryItemAdapter(items = AdapterData.getCategoryData())
        binding.itemLayout.itemsList.adapter = ItemAdapter(items = AdapterData.getItemsData())

        changeBarColor(activity = this, view = binding.root)
    }
}
