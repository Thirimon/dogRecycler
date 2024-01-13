package com.example.dogrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogrecycler.Const.Layout
import com.example.dogrecycler.adapter.DogCardAdapter
import com.example.dogrecycler.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {
    private lateinit var binding:ActivityVerticalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.verticalRecyclerView.adapter=DogCardAdapter(applicationContext, Layout.VERTICAL)
        binding.verticalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}