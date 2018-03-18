package com.example.brianhsu.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.brianhsu.coderswag.R
import com.example.brianhsu.coderswag.Utilities.EXTRA_PRODUCT

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val productType = intent.getStringExtra(EXTRA_PRODUCT)
        println(productType)
    }
}
