package com.example.spendwise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spendwise.adapters.RestaurantAdapter
import com.example.spendwise.databinding.ActivityLunchBinding
import com.example.spendwise.models.RestaurantIItemModel
import com.example.spendwise.models.RestaurantModel

class LunchActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLunchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLunchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolBarLayout.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }
        val verticalRecyclerView: RecyclerView = findViewById(R.id.verticalRecyclerView)

        val dataList : ArrayList<RestaurantModel> = arrayListOf(
            RestaurantModel(
                "Aruna Mess",
                "4.2",
                "19 min",
                "1.2 km",
                99,
                arrayListOf(
                    RestaurantIItemModel(R.drawable.food,false, "Non Veg Thali", " Chicken Masala + 3 Roti", 125 , "4.7", 78),
                    RestaurantIItemModel(R.drawable.veg_food_thali,true, "Veg Thali", "Panner Masala + 3 Roti", 115, "4.4", 78)
                )
            ),
            RestaurantModel(
                "Chef Shweta",
                "4.8",
                "21 min",
                "1.5 km",
                80,
                arrayListOf(
                    RestaurantIItemModel(R.drawable.tawa_pulao,true,"Tawa Pulao", "cooked with basmati rice", 80 , "4.8", 65),
                    RestaurantIItemModel(R.drawable.chicken_thali,false,"Chicken Thali", "Chicken Masala + 3 Roti", 125, "4.9", 78)
                )
            ),
            RestaurantModel(
                "Aruna Mess",
                "4.2",
                "19 min",
                "1.2 km",
                99,
                arrayListOf(
                    RestaurantIItemModel(R.drawable.food,false,"Non Veg Thali", " Chicken Masala + 3 Roti", 125 , "4.7", 78),
                    RestaurantIItemModel(R.drawable.veg_food_thali,true,"Veg Thali", "Panner Masala + 3 Roti", 115, "4.4", 78)
                )
            )
        )

        val verticalLayoutManager = LinearLayoutManager(this)
        verticalRecyclerView.layoutManager = verticalLayoutManager

        val verticalAdapter = RestaurantAdapter(dataList)
        verticalRecyclerView.adapter = verticalAdapter
    }
}