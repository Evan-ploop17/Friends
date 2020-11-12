package com.example.friends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_user.*

class User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val imageIn = intent.getStringExtra("image")
        val image = imageIn?.toInt()
        val description = intent.getStringExtra("description")

        Log.v("parameterId", "$imageIn")
        Log.v("parametersDes", "$description")

        imageView.setImageResource(image!!)

        textDescription.text = description.toString()
    }
}