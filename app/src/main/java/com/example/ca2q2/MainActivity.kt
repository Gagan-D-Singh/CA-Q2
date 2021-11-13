package com.example.ca2q2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showToast(view: android.view.View) {
        Toast.makeText(applicationContext,"You selected Male", Toast.LENGTH_LONG).show()
    }

    fun showtoast(view: android.view.View) {
        Toast.makeText(applicationContext,"You selected Female", Toast.LENGTH_LONG).show()
    }

    fun ShowToast(view: android.view.View) {
        Toast.makeText(applicationContext,"You will be Remembered", Toast.LENGTH_LONG).show()
    }

    fun Showtoast(view: android.view.View) {
        Toast.makeText(applicationContext,"Successfully Submitted", Toast.LENGTH_LONG).show()
    }
}

