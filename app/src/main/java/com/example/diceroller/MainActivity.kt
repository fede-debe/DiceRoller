package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_roll.text = resources.getString(R.string.roll) // change the value of the text by using a String

        // set an event for this View
        btn_roll.setOnClickListener{
            // Toast.makeText(this, "Let's Roll", Toast.LENGTH_LONG).show()
            rollDice() // each time the user click on it will get a result from this method
        }
    }

    private fun rollDice() {
        val resultImageDice = when ((1..6).random()) { // based on the random result I want to display the related image
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }

        dice_image.setImageResource(resultImageDice) // we set the image related to the random number to this View
    }
}