package com.minhoi.jetpackex3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.minhoi.jetpackex3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        setContentView(R.layout.activity_main

        val array = arrayListOf<String>()
        array.add("a")
        array.add("b")
        array.add("c")
        array.add("a")
        array.add("b")
        array.add("c")
        array.add("a")
        array.add("b")
        array.add("c")
        array.add("a")
        array.add("b")
        array.add("c")

        val customAdapter = CustomAdapter(array)

        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.adapter = customAdapter
        rv.layoutManager = LinearLayoutManager(this)

    }

}