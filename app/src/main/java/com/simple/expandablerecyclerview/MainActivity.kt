package com.simple.expandablerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.simple.expandablerecyclerview.DummyData.dummyData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exRecyclerView = findViewById<RecyclerView>(R.id.exRecycle)
        exRecyclerView.layoutManager = LinearLayoutManager(this)
        exRecyclerView.adapter = RecyclerViewAdapter(this@MainActivity,dummyData)
    }
}