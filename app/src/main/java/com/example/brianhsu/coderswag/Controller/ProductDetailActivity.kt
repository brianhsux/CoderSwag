package com.example.brianhsu.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.brianhsu.coderswag.Model.Product
import com.example.brianhsu.coderswag.R
import com.example.brianhsu.coderswag.Utilities.EXTRA_PRODUCT_DETAIL
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val produtInfo = intent.getParcelableExtra<Product>(EXTRA_PRODUCT_DETAIL)
        val productName = produtInfo.title
        val productPrice = produtInfo.price
        val productImage = produtInfo.image
        val productDes = produtInfo.description

        val imageResource = this.resources.getIdentifier(productImage, "drawable", this.packageName)
        productDetailImage.setImageResource(imageResource)

        productDetailName.text = productName
        productDetailPrice.text = productPrice
        productDetailDes.text = productDes
    }
}
