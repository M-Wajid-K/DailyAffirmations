package com.example.dailyaffirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Define the array of affirmations
    private lateinit var affirmations: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load affirmations from strings.xml
        affirmations = resources.getStringArray(R.array.affirmations)

        // Initialize views
        val affirmationText: TextView = findViewById(R.id.affirmationText)
        val generateButton: Button = findViewById(R.id.generateButton)

        // Set a click listener on the button to generate a new affirmation
        generateButton.setOnClickListener {
            val randomIndex = Random.nextInt(affirmations.size)
            affirmationText.text = affirmations[randomIndex]
        }
    }
}
