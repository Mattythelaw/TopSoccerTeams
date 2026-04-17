package com.example.topsoccerteams

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    //top level function//

    val teams = arrayOf("Liverpool", "Man City", "Manchester", "Orlando Pirates", "Chelsea")

    //Adding function for shortest string in array//
    fun getShortest(arr: Array<String>): String {
        var shortest = arr[0]
        for (team in arr) {
            if (team.length < shortest.length) {
                shortest = team
        }
    }
        return shortest
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //local function//

        val teamsTxt = findViewById<TextView>(R.id.teamDisplayTxt)
        var teamDisplayTxt = " "
        var count = 0

        //reassigning position 0 of the teams array//
        teams[0] = "Liverpool :)"

        //while loop to iterate through the teams array and display team
               while(count < teams.count()){
                   teamDisplayTxt += "${teams[count]}\n"
                 count++
             }
        //Calling getShortest and displaying the result//


//        for (team in teams) {
//            teamDisplayTxt += "${teams}\n"//
//        }



        teamsTxt.text = teamDisplayTxt;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}