package com.jwhh.recyclerviewweatherlistexercise

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import java.lang.IllegalArgumentException

class WeatherAdapter(private val rows: List<IRow>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface IRow

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener {

        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {

        mListener = listener

    }
    data class WeatherItem(var day: String, var temperature: String, var low_temp: String, var high_temp: String, var precip: String, var descrip: String) : IRow

    companion object {
        private const val WEATHER_ROW = 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):WeatherViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.weather_list_item, parent, false)
        return WeatherViewHolder(itemView, mListener)
    }


    override fun getItemCount()= rows.count()

    // Implement using the interface

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (holder.itemViewType) {
            WEATHER_ROW -> onBindWeatherRow(holder, rows[position] as WeatherItem)

            else -> throw IllegalArgumentException()
        }

    private fun onBindWeatherRow(holder: RecyclerView.ViewHolder, row: WeatherItem) {
        val weatherRow = holder as WeatherViewHolder
        weatherRow.weatherDay.text = row.day
        weatherRow.weatherTemp.text = row.temperature
        weatherRow.weatherHTemp.text = row.high_temp
        weatherRow.weatherLTemp.text = row.low_temp
        weatherRow.weatherprecip.text = row.precip
        weatherRow.weatherdescrip.text = row.descrip

    }



}




