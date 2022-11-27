package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextMe = findViewById<TextView>(R.id.myText1)
        val btnClickMe = findViewById<Button>(R.id.myButton1)
        val btnClickMe2 = findViewById<Button>(R.id.myButton2)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1
            if (timesClicked % 10 == 0)
                TextMe.text= "Bingo!"
            else
                TextMe.text= timesClicked.toString()
        btnClickMe2.setOnClickListener {
            timesClicked = 0
            TextMe.text = "0"
        }
        }
    }
}