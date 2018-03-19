package com.example.brianhsu.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.brianhsu.coderswag.Adapters.CategoryRecycleAdapter
import com.example.brianhsu.coderswag.R
import com.example.brianhsu.coderswag.Services.DataService
import com.example.brianhsu.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val produtIntent = Intent(this, ProductActivity::class.java)
            produtIntent.putExtra(EXTRA_PRODUCT, category.title)
            startActivity(produtIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
