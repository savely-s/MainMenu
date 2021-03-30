package com.example.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Load_Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_game)

        val Exit = findViewById<Button>(R.id.b_Exit)
        Exit.setOnClickListener {
            val ActivitySwitcher = Intent(this, Main_Menu::class.java)
            startActivity(ActivitySwitcher)
        }


    }
}