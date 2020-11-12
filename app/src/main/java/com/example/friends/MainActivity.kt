package com.example.friends

import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_user.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changePics(R.drawable.character1, "Character 1")
        changePics(R.drawable.character2, "Character 2")
        changePics(R.drawable.character3, "Character 3")
        changePics(R.drawable.character4, "Character 4")
        changePics(R.drawable.character5, "Character 5")
        changePics(R.drawable.character6, "Character 6")
    }

    private fun changePics(id: Int, description: String){

        val id = id
        val description = description

        val pics: ImageView = ImageView(this)
        pics.setImageResource(id)
        pics.setPaddingRelative(0,0,0,50)
        linearPics.addView(pics)

        pics.setOnClickListener {
            val intentUser = Intent(this, User::class.java)
            val image = id.toString()
            intentUser.putExtra("description","$description")
            intentUser.putExtra("image","$image")
            startActivity(intentUser)
        }
    }
}