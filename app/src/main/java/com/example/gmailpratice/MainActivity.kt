package com.example.gmailpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>()
        repeat(28) {
            val index = it + 1
            items.add(ItemModel(
            "\uD83D\uDCE9Tuto.com   ",
                "$19 only (First 10 spots) - Bestselling...Are you looking to Learn Web...",
                "12:34 PM",
                resources.getIdentifier("test", "drawable", packageName)
            ))
        }

        findViewById<ListView>(R.id.list_view).adapter = ItemAdapter(items)
    }


}