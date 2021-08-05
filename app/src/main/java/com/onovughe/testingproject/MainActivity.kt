package com.onovughe.testingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.onovughe.testingproject.model.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Step 11
        val products = arrayListOf<Product>()
        for (i in 0..100){
            products.add(Product("Apple", "http://via.placeholder.com/200x200/dddddd/000000", 2000.00))
        }

        //step1
        recycler_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2) //change LinearLayoutManager to Grid after Step 13

            //Step2 and create ProductAdapter kotlin class => step3
            adapter = ProductsAdapter(products) //(Step 12 products)
        }
    }
}