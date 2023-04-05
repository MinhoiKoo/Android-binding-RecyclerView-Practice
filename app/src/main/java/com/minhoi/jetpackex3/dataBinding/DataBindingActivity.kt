package com.minhoi.jetpackex3.dataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.minhoi.jetpackex3.R
import com.minhoi.jetpackex3.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_data_binding)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

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

        val customDataAdapter = CustomDataAdapter(array)
        val rv = binding.rv
        rv.adapter = customDataAdapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}