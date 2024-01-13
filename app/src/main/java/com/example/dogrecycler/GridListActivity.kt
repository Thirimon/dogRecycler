package com.example.dogrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogrecycler.Const.Layout
import com.example.dogrecycler.adapter.DogCardAdapter
import com.example.dogrecycler.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {
    private lateinit var binding:ActivityGridListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.gridRecyclerView.adapter=DogCardAdapter(applicationContext, Layout.GRID)
        binding.gridRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}