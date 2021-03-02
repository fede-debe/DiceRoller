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


        btn_roll.text = resources.getString(R.string.roll)

        btn_roll.setOnClickListener{
            // Toast.makeText(this, "Let's Roll", Toast.LENGTH_LONG).show()
            rollDice()
        }
       

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        tv_roll_result.text = randomInt.toString()
    }


}