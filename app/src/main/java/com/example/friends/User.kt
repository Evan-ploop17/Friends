package com.example.friends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.KeyEvent
import kotlinx.android.synthetic.main.activity_user.*

class User : AppCompatActivity() {

    private val key = "MY_KEY"
    private var score = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val imageIn = intent.getStringExtra("image")
        val image = imageIn?.toInt()
        val description = intent.getStringExtra("description")

        val preferences = PreferenceManager.getDefaultSharedPreferences(this)
        val value = preferences.getFloat(key, score)

        imageView.setImageResource(image!!)
        textDescription.text = description.toString()
        calification.rating = value

        calification.setOnRatingBarChangeListener { ratingBar, fl, b ->
            score = fl
            val editor = preferences.edit()
            editor.putFloat(key, fl)
            editor.apply()
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyDown(keyCode, event)

        val mainActivity = Intent(this, MainActivity::class.java)
        mainActivity.putExtra("score", score)
        startActivity(mainActivity)
    }

}