package com.example.musicbysas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        val backButton=findViewById<Button>(R.id.back_button)
        val musictext=findViewById<TextView>(R.id.musictext)
        val fav_btn=findViewById<ImageView>(R.id.fav_btn)
        val full_image=findViewById<ImageView>(R.id.full_image)
        val title_songs=findViewById<TextView>(R.id.title_songs)
        val endTimingText=findViewById<TextView>(R.id.endTimingText)
        val startTimingTextview=findViewById<TextView>(R.id.startTimingTextview)
        val music_back=findViewById<Button>(R.id.music_back)
        val music_pause=findViewById<Button>(R.id.music_pause)
        val forward_btn=findViewById<Button>(R.id.forward_btn)
        val repeat_button=findViewById<ImageButton>(R.id.repeat_button)
        val equalizer=findViewById<ImageButton>(R.id.equalizer)
        val power=findViewById<ImageButton>(R.id.power)
        val share=findViewById<ImageButton>(R.id.share)
        val seekBar=findViewById<SeekBar>(R.id.seekBar)






    }
}