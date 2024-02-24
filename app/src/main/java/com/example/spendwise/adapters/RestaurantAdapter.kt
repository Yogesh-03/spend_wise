package com.example.spendwise.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spendwise.R
import com.example.spendwise.models.RestaurantModel

class RestaurantAdapter(
    private val restaurantModelList : ArrayList<RestaurantModel>
) : RecyclerView.Adapter<RestaurantAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurant_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return restaurantModelList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val horizontalLayoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
        holder.horizontalRecyclerView.layoutManager = horizontalLayoutManager

        val horizontalAdapter = RestaurantItemAdapter(restaurantModelList[position].items)
        holder.bind(restaurantModelList[position])
        holder.horizontalRecyclerView.adapter = horizontalAdapter
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val restaurantName:TextView = itemView.findViewById(R.id.restaurantName)
        private val restaurantRating:TextView = itemView.findViewById(R.id.restaurantRating)
        private val timeAndDistance :TextView = itemView.findViewById(R.id.timeAndDistance)
        private val startingPrice:TextView = itemView.findViewById(R.id.startingPrice)
        val horizontalRecyclerView:RecyclerView = itemView.findViewById(R.id.horizontalRecyclerView)

        fun bind(data : RestaurantModel){
            restaurantName.text = data.name
            restaurantRating.text = data.rating
            timeAndDistance.text = data.time + " | " + data.distance
            startingPrice.text = "Starts from ₹ " + data.startingPrice.toString() + " only"
        }
    }
}