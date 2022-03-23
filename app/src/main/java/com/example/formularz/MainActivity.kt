package com.example.formularz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.app.Dialog
import android.provider.MediaStore
import android.view.View
import android.view.Window
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kobieta = findViewById<RadioButton>(R.id.radioButton)
        val sport = findViewById<CheckBox>(R.id.checkBox)
        val muzyka = findViewById<CheckBox>(R.id.checkBox3)
        val gry = findViewById<CheckBox>(R.id.checkBox4)
        /*val wiek = findViewById<EditText>(R.id.editTextNumber).toString().toInt()*/
        val turystyka = findViewById<CheckBox>(R.id.checkBox2)

        findViewById<Button>(R.id.button).setOnClickListener {
                val result = StringBuilder()
                result.append("Dane:")

                if (kobieta.isChecked) {
                    result.append("\nKobieta")
                }

                if (sport.isChecked) {
                    result.append("\nSport")

                }
                if (muzyka.isChecked) {
                    result.append("\nMuzyka")
                }
                if (gry.isChecked) {
                    result.append("\nGry")
                }
                if (turystyka.isChecked) {
                    result.append("\nTurystyka")
                }

                Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()


            }
    }
    }
