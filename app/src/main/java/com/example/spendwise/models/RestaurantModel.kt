package com.example.spendwise.models

data class RestaurantModel(
     val name:String,
     val rating:String,
     val time:String,
     val distance:String,
     val startingPrice:Int,
     val items:ArrayList<RestaurantIItemModel>
) {

}