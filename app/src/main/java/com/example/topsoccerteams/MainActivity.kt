package com.example.topsoccerteams

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

//created function to display in the terminal
fun logArrValues(arr: Array<String>, limit:  Int = 0) {
    //if statement to check if there is a limit//
    if (limit == 0) {
        Log.v("Array Values: ", Arrays.toString(arr))
    }
    else
    {

class MainActivity : AppCompatActivity() {

    val teams = arrayOf ("Liverpool", "Man City", "Manchester", "Orlando Pirates", "Chelsea")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val teamsTxt = findViewById<TextView>(R.id.teamDisplayTxt)
        var teamDisplayTxt = " "
        var count = 0

        //Calling logArrValues function
        logArrValues(teams)
        logArrValues(teams, 4)

        //reassigning position 0 of the teams array//
        teams[0] = "Liverpool"

        //while loop to iterate through the teams array and display team//
 //       while(count < teams.count()){
 //           teamDisplayTxt += "${teams[count]}\n"
 //           count++
 //       }

        for(team in teams){
            teamDisplayTxt += "${teams}\n"
        }




        teamsTxt.text = Arrays.toString(teams)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}