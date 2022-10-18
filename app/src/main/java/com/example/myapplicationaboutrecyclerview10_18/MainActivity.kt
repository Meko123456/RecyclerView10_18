package com.example.myapplicationaboutrecyclerview10_18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationaboutrecyclerview10_18.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val namesList = mutableListOf<String>()

        namesList.add("Kayla Olson")
        namesList.add("Kayla Olson")
        namesList.add("Rylan Frank")
        namesList.add("Aeremy Mccall")
        namesList.add("Ibrahim Shaw")
        namesList.add("Aayanara Sampson")
        namesList.add("Jada Mcdaniel")
        namesList.add("Elliot Rangel")

        binding.recyclerView.adapter = NameAdapter(namesList)

    }
}