package com.example.intervalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var dataModel: ArrayList<DataModel>? = null


    private lateinit var listView: ListView
    private lateinit var adapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adds toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        //initialize elements from main layout
        listView = findViewById<ListView>(R.id.list)
        //initialize model and adding data
        dataModel = ArrayList<DataModel>()
        dataModel!!.add(DataModel("Week 1, Day 1", false))
        dataModel!!.add(DataModel("Week 1, Day 2", false))
        dataModel!!.add(DataModel("Week 1, Day 3", false))
        dataModel!!.add(DataModel("Week 2, Day 1", false))
        dataModel!!.add(DataModel("Week 2, Day 2", false))
        dataModel!!.add(DataModel("Week 2, Day 3", false))
        dataModel!!.add(DataModel("Week 3, Day 1", false))
        dataModel!!.add(DataModel("Week 3, Day 2", false))
        dataModel!!.add(DataModel("Week 3, Day 3", false))
        dataModel!!.add(DataModel("Week 4, Day 1", false))
        dataModel!!.add(DataModel("Week 4, Day 2", false))
        dataModel!!.add(DataModel("Week 4, Day 3", false))
        dataModel!!.add(DataModel("Week 5, Day 1", false))
        dataModel!!.add(DataModel("Week 5, Day 2", false))
        dataModel!!.add(DataModel("Week 5, Day 3", false))
        dataModel!!.add(DataModel("Week 6, Day 1", false))
        dataModel!!.add(DataModel("Week 6, Day 2", false))
        dataModel!!.add(DataModel("Week 6, Day 3", false))
        dataModel!!.add(DataModel("Week 7, Day 1", false))
        dataModel!!.add(DataModel("Week 7, Day 2", false))
        dataModel!!.add(DataModel("Week 7, Day 3", false))
        dataModel!!.add(DataModel("Week 8, Day 1", false))
        dataModel!!.add(DataModel("Week 8, Day 2", false))
        dataModel!!.add(DataModel("Week 8, Day 3", false))

        //setting adapter
        adapter = CustomAdapter(dataModel!!, applicationContext)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val dataModel: DataModel = dataModel!![position] as DataModel
            if(position==0){
                Toast.makeText(this, "woooooo", Toast.LENGTH_LONG)
            }else if(position==1){
                Toast.makeText(this, "two", Toast.LENGTH_LONG)
            }
        }





        /*val list:Array<String> = resources.getStringArray(R.array.daysList)
        var listView = findViewById<ListView>(R.id.list)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = arrayAdapter*/


    }
}