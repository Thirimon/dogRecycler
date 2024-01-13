package com.example.dogrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogrecycler.Const.Layout
import com.example.dogrecycler.adapter.DogCardAdapter
import com.example.dogrecycler.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHorizontalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.horizontalRecyclerView.adapter=DogCardAdapter(applicationContext, Layout.HORIZONTAL)
        binding.horizontalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}