package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
// one of the job of AppCompactActivity class is to provide a toolbar that looks the same across different platform OS levels
// Androidx refers to the libraries within the Android JetPack -> they come with the documentation and tools that you need to make great modern Android apps
class MainActivity : AppCompatActivity() {

    // optimizing the code, if we use each time the extension directly could be expensive inside a bigger app. I assigned it to this var when needed.
    lateinit var diceImage: ImageView // we will initialize this var when we need it

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_roll.text = resources.getString(R.string.roll) // change the value of the text by using a String

        // set an event for this View
        btn_roll.setOnClickListener{
            // Toast.makeText(this, "Let's Roll", Toast.LENGTH_LONG).show()
            rollDice() // each time the user click on it will get a result from this method
        }
        // View assigned to the variable
        diceImage = dice_image
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

        diceImage.setImageResource(resultImageDice) // we set the image related to the random number to this View
    }
}