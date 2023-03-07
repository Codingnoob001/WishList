package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    var theItems : MutableList<data> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycler = findViewById<RecyclerView>(R.id.Recycler)
        var adapter = myAdapter(theItems)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)

        val submitButton = findViewById<Button>(R.id.button)
        val ItemList = findViewById<EditText>(R.id.ItemLink)
        val ItemName = findViewById<EditText>(R.id.itemName)
        val quantity = findViewById<EditText>(R.id.editTextNumber)
        submitButton.setOnClickListener{
            val text = ItemName.text.toString()
            val textlink = ItemList.text.toString()
            val price = quantity.text.toString()
            val disp = data(text, price, textlink)
            theItems.add(disp)
            adapter.notifyDataSetChanged()
            ItemName.text.clear()
            ItemList.text.clear()
            quantity.text.clear()


        }


    }
}