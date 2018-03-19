package com.example.brianhsu.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.brianhsu.coderswag.Adapters.ProductsAdapter
import com.example.brianhsu.coderswag.R
import com.example.brianhsu.coderswag.Services.DataService
import com.example.brianhsu.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var productAdapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val productType = intent.getStringExtra(EXTRA_PRODUCT)
        productAdapter = ProductsAdapter(this, DataService.getProducts(productType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp

        if (screenSize > 720) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.adapter = productAdapter
        productListView.layoutManager = layoutManager

    }
}
