package com.example.spendwise.models

data class RestaurantIItemModel(
     val image:Int,
     val veg:Boolean,
     val name:String,
     val content:String,
     val price:Int,
     val rating:String,
     val ratingCount:Int
) {
}