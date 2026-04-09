package com.example.topsoccerteams

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {

    val teams = arrayOf ("Liverpool", "Man City", "Manchester", "Orlando Pirates", "Chelsea")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val teamsTxt = findViewById<TextView>(R.id.teamDisplayTxt)

        teams[0] = "Liverpool"

        var teamDisplayTxt = " "
        teamDisplayTxt += "${teams[0]}\n"
        teamDisplayTxt += "${teams[1]}\n"
        teamDisplayTxt += "${teams[2]}\n"
        teamDisplayTxt += "${teams[3]}\n"
        teamDisplayTxt += "${teams[4]}\n"

        teamsTxt.text = Arrays.toString(teams)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}