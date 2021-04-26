package com.example.intentexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

//            val intent = Intent(this, SecondActivity::class.java).apply {
//
//                // Pass data to second activity
//                putExtra("Name", "Robert")
//                putExtra("Age", 40)
//            }

            val intent = Intent(this, SecondActivity::class.java)
            // Put all data into one bundle
            val bundle = Bundle().apply {
                putString("Name", "Robert")
                putInt("Age", 40)
            }
            intent.putExtras(bundle)

            startActivity(intent)
        }

        // Open webpage
        binding.button2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW) // implicit intent
            intent.data = Uri.parse("http://www.yahoo.com.tw")
            startActivity(intent)
        }

        // Open dial
        binding.button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL) // implicit intent
            intent.data = Uri.parse("tel:080023523632")
            startActivity(intent)
        }

    }
}