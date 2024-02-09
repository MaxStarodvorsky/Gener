package com.example.myapplicationgenerator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateButton = findViewById<Button>(R.id.generateButton)
        val passwordTextView = findViewById<TextView>(R.id.passwordTextView)

        generateButton.setOnClickListener {
            val password = generatePassword()
            passwordTextView.text = password
        }
    }

    private fun generatePassword(): String {
        val letters = "abcdefghijklmnopqrstuvwxyz"
        val numbers = "0123456789"
        val password = StringBuilder()

        for (i in 0 until 10) {
            if (i % 2 == 0) {
                password.append(letters.random())
            } else {
                password.append(numbers.random())
            }
        }

        return password.toString()
    }
}