package com.uife.clothesapp.data

import com.uife.clothesapp.model.CategoryModel
import com.uife.clothesapp.model.ItemModel

object AdapterData {

    fun getCategoryData(): List<CategoryModel> {
        return listOf(
            CategoryModel(title = "Dresses", color = "lightFace", image = "dresses"),
            CategoryModel(title = "Home Decor", color = "lightBlue", image = "home"),
            CategoryModel(title = "Footwear", color = "lightPurple", image = "slipper"),
            CategoryModel(title = "Electronics", color = "lightYellow", image = "television"),
            CategoryModel(title = "Plants", color = "lightGreen", image = "plant")
        )
    }

    fun getItemsData(): List<ItemModel> {
        return listOf(
            ItemModel(image = "one",title = "Summer Vibes", topWear = "Shirt",
                topWearPrice = 100, bottomWear = "Trouser", bottomWearPrice = 160,
                totalPrice = 260),
            ItemModel(image = "two",title = "Summer Vibes", topWear = "Shirt",
                topWearPrice = 100, bottomWear = "Trouser", bottomWearPrice = 160,
                totalPrice = 260),
            ItemModel(image = "three",title = "Summer Vibes", topWear = "Shirt",
                topWearPrice = 100, bottomWear = "Trouser", bottomWearPrice = 160,
                totalPrice = 260),
            ItemModel(image = "four",title = "Summer Vibes", topWear = "Shirt",
                topWearPrice = 100, bottomWear = "Trouser", bottomWearPrice = 160,
                totalPrice = 260),
            ItemModel(image = "five",title = "Summer Vibes", topWear = "Shirt",
                topWearPrice = 100, bottomWear = "Trouser", bottomWearPrice = 160,
                totalPrice = 260),
            ItemModel(image = "six",title = "Summer Vibes", topWear = "Shirt",
                topWearPrice = 100, bottomWear = "Trouser", bottomWearPrice = 160,
                totalPrice = 260),
            ItemModel(image = "seven",title = "Summer Vibes", topWear = "Shirt",
                topWearPrice = 100, bottomWear = "Trouser", bottomWearPrice = 160,
                totalPrice = 260),
            ItemModel(image = "eight",title = "Summer Vibes", topWear = "Shirt",
                topWearPrice = 100, bottomWear = "Trouser", bottomWearPrice = 160,
                totalPrice = 260)
        )
    }
}