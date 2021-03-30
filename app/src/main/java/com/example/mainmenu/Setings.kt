package com.example.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Setings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setings)

        val exit = findViewById<Button>(R.id.Exit1)
        exit.setOnClickListener {
            val ActivitySwitcher = Intent(this, Main_Menu::class.java)
            startActivity(ActivitySwitcher)
        }

    }
}