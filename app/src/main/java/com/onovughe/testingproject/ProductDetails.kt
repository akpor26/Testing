package com.onovughe.testingproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.product_details.*

//Step 14
class ProductDetails : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)// Step 15 Create product_details xml file

        //Step 18
        val title = intent.getStringExtra("title")
        product_name.text = title
    }
}