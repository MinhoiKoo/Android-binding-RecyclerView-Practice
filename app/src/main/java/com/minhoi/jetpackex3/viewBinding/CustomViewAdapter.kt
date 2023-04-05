package com.minhoi.jetpackex3.viewBinding

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.minhoi.jetpackex3.R
import com.minhoi.jetpackex3.databinding.TextRowItemBinding

class CustomViewAdapter (private val dataSet : ArrayList<String>) : RecyclerView.Adapter<CustomViewAdapter.ViewHolder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = TextRowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.myText.text = dataSet[position]
    }


    inner class ViewHolder(binding : TextRowItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val myText : TextView = binding.myText

    }

}