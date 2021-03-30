package com.example.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val continue_game = findViewById<Button>(R.id.b_continue)
        continue_game.setOnClickListener {
            val ActivitySwitcher = Intent(this, Continue::class.java)
            startActivity(ActivitySwitcher)


        }
        val newGame = findViewById<Button>(R.id.b_continue)
        newGame.setOnClickListener {
            val ActivitySwitcher = Intent(this, New_Game::class.java)
            startActivity(ActivitySwitcher)


        }

        val loadGame = findViewById<Button>(R.id.b_continue)
        loadGame.setOnClickListener {
            val ActivitySwitcher = Intent(this, Load_Game::class.java)
            startActivity(ActivitySwitcher)


        }

        val setings = findViewById<Button>(R.id.b_continue)
        setings.setOnClickListener {
            val ActivitySwitcher = Intent(this, Setings::class.java)
            startActivity(ActivitySwitcher)
        }

        val exit = findViewById<Button>(R.id.b_continue)
        exit.setOnClickListener {
            val ActivitySwitcher = Intent(this, Exit::class.java)
            startActivity(ActivitySwitcher)


        }





    }
}