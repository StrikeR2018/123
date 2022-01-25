package com.jwhh.recyclerviewweatherlistexercise

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class WeatherViewHolder (itemView: View, listener: WeatherAdapter.onItemClickListener) : RecyclerView.ViewHolder(itemView){
    val weatherDay : TextView = itemView.findViewById(R.id.day)
    val weatherTemp : TextView = itemView.findViewById(R.id.temperature)
    val weatherLTemp : TextView = itemView.findViewById(R.id.low_temp)
    val weatherHTemp : TextView = itemView.findViewById(R.id.high_temp)
    val weatherprecip : TextView = itemView.findViewById(R.id.precip)
    val weatherdescrip : TextView = itemView.findViewById(R.id.descrip)

    init {
        itemView.setOnClickListener {
            listener.onItemClick(adapterPosition)
        }
    }
}

