package com.example.spendwise.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.spendwise.R
import com.example.spendwise.models.RestaurantIItemModel

class RestaurantItemAdapter(
    private val restaurantItemList:ArrayList<RestaurantIItemModel>
): RecyclerView.Adapter<RestaurantItemAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurant_food_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return restaurantItemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(restaurantItemList[position])
    }

    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        private  val image : ImageView = itemView.findViewById(R.id.foodImage)
        private  val veg : ImageView = itemView.findViewById(R.id.veg)
        private  val foodName:TextView = itemView.findViewById(R.id.name)
        private  val content : TextView = itemView.findViewById(R.id.content)
        private  val price : TextView = itemView.findViewById(R.id.price)
        private  val rating : TextView = itemView.findViewById(R.id.rating)
        private  val ratingCount : TextView = itemView.findViewById(R.id.ratingCount)

        fun bind(data : RestaurantIItemModel){
            if (data.veg) veg.setImageResource(R.drawable.veg)
            else veg.setImageResource(R.drawable.non_veg)

            image.setImageResource(data.image)
            foodName.text = data.name
            content.text = data.content
            price.text ="₹ " + data.price.toString()
            rating.text = data.rating
            ratingCount.text = "("+data.ratingCount.toString()+")"
        }
    }
}