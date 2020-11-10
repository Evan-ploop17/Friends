package com.example.friends

import android.content.Intent
import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.marginBottom
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changePics(R.drawable.character1)
        changePics(R.drawable.character2)
        changePics(R.drawable.character3)
        changePics(R.drawable.character4)
        changePics(R.drawable.character5)
        changePics(R.drawable.character6)
    }

    private fun changePics(id: Int){
        val pics: ImageView = ImageView(this)
        pics.setImageResource(id)
        pics.setPaddingRelative(0,0,0,50)
        linearPics.addView(pics)

        pics.setOnClickListener {
            val intentUser = Intent(this, User::class.java)
            intentUser.putExtra("user","description")
            intentUser.putExtra("image","$id")
            startActivity(intentUser)
        }
    }
}