package com.example.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Continue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continue)

        val exit = findViewById<Button>(R.id.exit_2)
        exit.setOnClickListener {
            val ActivitySwitcher = Intent(this, Main_Menu::class.java)
            startActivity(ActivitySwitcher)
        }
    }
}