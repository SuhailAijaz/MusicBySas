package com.example.musicbysas

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FavouriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)

        val backfav_button=findViewById<ImageButton>(R.id.backfav_button)
        val fav_text=findViewById<TextView>(R.id.fav_text)
        val floating=findViewById<FloatingActionButton>(R.id.floating)


    }
}