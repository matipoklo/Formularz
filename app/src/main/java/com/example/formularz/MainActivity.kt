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
        findViewById<Button>(R.id.button).setOnClickListener {
            val alert = CustomAlert()
            val kobieta = findViewById<RadioButton>(R.id.radioButton)
            val mezczyzna = findViewById<RadioButton>(R.id.radioButton4)
            val wiek = findViewById<EditText>(R.id.editTextNumber).toString().toInt()
            val sport = findViewById<CheckBox>(R.id.checkBox)
            val turystyka = findViewById<CheckBox>(R.id.checkBox2)
            val muzyka = findViewById<CheckBox>(R.id.checkBox3)
            val gry = findViewById<CheckBox>(R.id.checkBox4)

            findViewById<Button>(R.id.button).setOnClickListener(){

            }


            alert.showDialog(this,)
        }
    }
}
class CustomAlert {

    fun showDialog(activity: Activity?, msg: String?) {
        val dialog = Dialog(activity!!)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_layout)
        val text = dialog.findViewById<View>(R.id.text_dialog) as TextView
        text.text = msg
        val dialogButton: Button = dialog.findViewById<View>(R.id.btn_dialog) as Button
        dialogButton.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}