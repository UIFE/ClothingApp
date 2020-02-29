package com.uife.clothesapp.model

data class ItemModel (
    val image:String,
    val title: String,
    val topWear: String,
    val topWearPrice: Int,
    val bottomWear: String,
    val bottomWearPrice: Int,
    val totalPrice: Int
)