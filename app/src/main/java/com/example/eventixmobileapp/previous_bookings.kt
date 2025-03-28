package com.example.eventixmobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class previous_bookings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_previous_bookings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val my_bookings: Button = findViewById(R.id.my_bookings)
        my_bookings.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, mytickets::class.java)
            startActivity(intent)
        }

        // Get reference to the ImageView (Explore)
        val explorenavigate: ImageView = findViewById(R.id.explore)


        explorenavigate.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        // Get reference to the ImageView (Explore)
        val eventsnavigate: ImageView = findViewById(R.id.events)


        eventsnavigate.setOnClickListener {
            val intent = Intent(this, events::class.java)
            startActivity(intent)
        }

        // Get reference to the ImageView (Explore)
        val ticketnavigate: ImageView = findViewById(R.id.ticket)


        ticketnavigate.setOnClickListener {
            val intent = Intent(this, mytickets::class.java)
            startActivity(intent)
        }

        // Get reference to the ImageView (profile)
        val profilenavigate: ImageView = findViewById(R.id.profile)


        profilenavigate.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        val prev_events: Button = findViewById(R.id.prev_bookings)
        prev_events.setOnClickListener {
            // Create an Intent to start the NextActivity
            val intent = Intent(this, previous_bookings::class.java)
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}