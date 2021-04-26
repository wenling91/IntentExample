package com.example.intentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Retrieve data from intent

//        val name = intent.getStringExtra("Name")
//        val age = intent.getIntExtra("Age", 0)

        val bundle = intent.extras  // nullable data
        val name = bundle?.getString("Name")
        val age = bundle?.getInt("Age")

        // Show data
        Toast.makeText(this, "Name: $name Age: $age", Toast.LENGTH_SHORT).show()
    }
}