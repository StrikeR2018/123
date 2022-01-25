package com.jwhh.recyclerviewweatherlistexercise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

// Item Click Listener - RecyclerView using Kotlin || kotlin Item Click Listener in RecyclerView
// a great lecture given by Foxandroid
// reference link: https://www.youtube.com/watch?v=dB9JOsVx-yY
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        weather_list.adapter = WeatherAdapter(generateData(days, temp, low_temp,high_temp,precip,descrip))
        weather_list.layoutManager = LinearLayoutManager(this)
        var adapter = WeatherAdapter(generateData(days, temp, low_temp,high_temp,precip,descrip))

        weather_list.adapter = adapter

        adapter.setOnItemClickListener(object : WeatherAdapter.onItemClickListener {

            override fun onItemClick(position: Int) {
                    descrip
//                Toast.makeText(this@MainActivity, "Clicked on no. $position", Toast.LENGTH_SHORT).show()
                when (position) {
                    0 -> Toast.makeText(this@MainActivity, "Mostly sunny with clouds increasing in the evening", Toast.LENGTH_SHORT).show()
                    1 -> Toast.makeText(this@MainActivity, "Morning showers receding in the afternoon, with patches of sun later in the day", Toast.LENGTH_SHORT).show()
                    2 -> Toast.makeText(this@MainActivity, "Cooler, with morning fog lifting into a cloudy day", Toast.LENGTH_SHORT).show()
                    3 -> Toast.makeText(this@MainActivity, "Chance of light rain in the morning", Toast.LENGTH_SHORT).show()
                    4 -> Toast.makeText(this@MainActivity, "Early clouds clearing as the day goes on; nighttime temperatures approaching freezing", Toast.LENGTH_SHORT).show()
                    5 -> Toast.makeText(this@MainActivity, "Clouds increasing throughout the day with periods of sun interspersed", Toast.LENGTH_SHORT).show()
                    6 -> Toast.makeText(this@MainActivity, "Cloudy all day, with a slight chance of rain late in the evening", Toast.LENGTH_SHORT).show()
                    7 -> Toast.makeText(this@MainActivity, "Clouds increasing throughout the day with periods of sun interspersed", Toast.LENGTH_SHORT).show()
                    8 -> Toast.makeText(this@MainActivity, "Small chance of raniny", Toast.LENGTH_SHORT).show()
                    9 -> Toast.makeText(this@MainActivity, "Mostly sunny with clouds increasing in the evening", Toast.LENGTH_SHORT).show()
                    10 -> Toast.makeText(this@MainActivity, "Mostly sunny during the day", Toast.LENGTH_SHORT).show()
                    11 -> Toast.makeText(this@MainActivity, "nighttime temperatures approaching freezing", Toast.LENGTH_SHORT).show()
                    12 -> Toast.makeText(this@MainActivity, "Chance of light rain in the nighttime", Toast.LENGTH_SHORT).show()
                    13 -> Toast.makeText(this@MainActivity, "Mostly sunny with clouds increasing in the afternoon", Toast.LENGTH_SHORT).show()
                    14 -> Toast.makeText(this@MainActivity, "Chance of sunny rain in the mornin", Toast.LENGTH_SHORT).show()
                    15 -> Toast.makeText(this@MainActivity, "Cooler, with morning fog lifting into a cloudy day", Toast.LENGTH_SHORT).show()
                    16 -> Toast.makeText(this@MainActivity, "Cooler, with morning fog lifting into a cloudy day", Toast.LENGTH_SHORT).show()
                    17 -> Toast.makeText(this@MainActivity, "Slight chance of raniny", Toast.LENGTH_SHORT).show()
                    18 -> Toast.makeText(this@MainActivity, "Mostly sunny during the day", Toast.LENGTH_SHORT).show()
                    19 -> Toast.makeText(this@MainActivity, "Mostly raniny during the daytime and with a slight chance of rain late in the evening", Toast.LENGTH_SHORT).show()
                    20 -> Toast.makeText(this@MainActivity, "Morning showers receding in the afternoon, with patches of sun later in the day", Toast.LENGTH_SHORT).show()
                }



            }



        })
    }

    fun generateData(days: Array<String>, temp: Array<String>, low_temp: Array<String>,high_temp: Array<String>,precip: Array<String>,descrip: Array<String> ): List<WeatherAdapter.IRow> {
        // create our data as list of list
        val data = mutableListOf<WeatherAdapter.IRow>()
//
//        WeatherItem data;
//
//        data {
//
//            ((1)days
//            (2)temp
//            (3)low_temp  1
//            (4)high_temp
//            (5)precip
//            (6)descrip
//            )
//            ((1)days
//                    (2)temp
//                    (3)low_temp
//                    (4)high_temp
//                    (5)precip            2
//                    (6)descrip
//                    )
//            ((1)days
//                    (2)temp
//                    (3)low_temp
//                    (4)high_temp              3
//                    (5)precip
//                    (6)descrip
//                    )
//            ((1)days
//                    (2)temp
//                    (3)low_temp
//                    (4)high_temp           4
//                    (5)precip
//                    (6)descrip
//                    )
//            ((1)days
//                    (2)temp
//                    (3)low_temp
//                    (4)high_temp        5
//                    (5)precip
//                    (6)descrip
//                    )
//        }
//
//

        // adding as a list of list to recycler view
        for (i in 0..20) {
            data.add(WeatherAdapter.WeatherItem(days[i], temp[i],low_temp[i],high_temp[i],precip[i],descrip[i]))
        }
        weather_list
        return data
    }

    // Month
    val days = arrayOf("Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Jan","Feb","Feb","Feb")
    // date
    val temp = arrayOf("14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","1","2","3")
    // lower temperature
    val low_temp = arrayOf("43℉","39℉","39℉","36℉","33℉","36℉","39℉","36℉","33℉","36℉","38℉","35℉","30℉","31℉","35℉","37℉","39℉","38℉","40℉","41℉","40℉")
    // higher temperature
    val high_temp = arrayOf("51℉","55℉","47℉","53℉","49℉","49℉","48℉","45℉","47℉","43℉","45℉","43℉","46℉","44℉","43℉","45℉","46℉","47℉","48℉","50℉","49℉")
    // precipitation
    val precip = arrayOf("25% precip","25% precip","80% precip","10% precip","60% precip","10% precip","15% precip","30% precip",
        "25% precip","38% precip","20% precip","15% precip","50% precip","10% precip","30% precip","25% precip","25% precip",
        "15% precip","8% precip","11% precip", "80% precip")
    // phrase description of the weather
    val descrip = arrayOf("Mostly sunny","AM showers", "AM fog/PM clouds", "AM showers", "Partly cloudy", "Partly cloudy" ,
            "Mostly cloudy", "Showers", "AM showers", "Few showers", "Partly cloudy", "AM showers", "AM fog",
        "Mostly cloudy", "AM showers", "Partly cloudy", "AM fog", "Mostly sunny", "Showers", "Partly cloudy",
         "AM showers")



}











