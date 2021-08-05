package com.onovughe.testingproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.onovughe.testingproject.model.Product
import com.squareup.picasso.Picasso

class ProductsAdapter(private val products: ArrayList<Product>):RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {
//Step 4 create a new package called model and create a kotlin data class Product

    //Step 3 continuation
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //Step 10
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductsAdapter.ViewHolder, position: Int) {
        //Step 13
        Picasso.get().load(products[position].photoUrl).into(holder.image) // manifests settings
        //Step 9
        holder.title.text = products[position].title
        holder.price.text = products[position].price.toString()
    }

    //Step 6
    override fun getItemCount() = products.size

    //Step 5
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        //Step 7 Create a layout named product_row
        //Step 8
        val image: ImageView = itemView.findViewById(R.id.photo)
        val title: TextView = itemView.findViewById(R.id.title)
        val price: TextView = itemView.findViewById(R.id.price)

    }
}