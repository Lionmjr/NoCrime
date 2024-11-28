package com.example.nocrime;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val startLessonButton = findViewById<Button>(R.id.startLessonButton)
                val profileButton = findViewById<Button>(R.id.profileButton)
                val settingsButton = findViewById<Button>(R.id.settingsButton)

                // Set click listener for Start Lesson button
                startLessonButton.setOnClickListener {
            startActivity(Intent(this, LessonActivity::class.java))
        }

        // Set click listener for Profile button
        profileButton.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        // Set click listener for Settings button
        settingsButton.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}