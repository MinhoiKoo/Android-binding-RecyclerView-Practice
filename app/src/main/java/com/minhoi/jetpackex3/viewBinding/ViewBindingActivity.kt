package com.minhoi.jetpackex3.viewBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.minhoi.jetpackex3.R
import com.minhoi.jetpackex3.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityViewBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

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

        val customAdapter = CustomViewAdapter(array)
        val rv = binding.rv
        rv.adapter = customAdapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}