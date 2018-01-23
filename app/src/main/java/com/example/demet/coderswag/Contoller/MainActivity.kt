package com.example.demet.coderswag.Contoller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import com.example.demet.coderswag.Adapters.CategoryAdapter
import com.example.demet.coderswag.Adapters.CategoryRecycleAdapter
import com.example.demet.coderswag.Model.Category
import com.example.demet.coderswag.R
import com.example.jonnyb.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categorylisView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categorylisView.layoutManager = layoutManager
        categorylisView.setHasFixedSize(true)
    }
}
