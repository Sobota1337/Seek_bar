package com.example.seek_bar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {

    fun suma_poziomu(): Int {
        val obraz1_poziom = findViewById<SeekBar>(R.id.poziom1)
        val obraz2_poziom = findViewById<SeekBar>(R.id.poziom2)
        val suma = obraz1_poziom.progress + obraz2_poziom.progress
        return suma
    }


        fun suma_pionu(): Int {
            val obraz1_pion = findViewById<SeekBar>(R.id.pion1)
            val obraz2_pion = findViewById<SeekBar>(R.id.pion2)
            val suma = obraz1_pion.progress + obraz2_pion.progress
            return suma
        }
        fun changed(progressBar: ProgressBar, suma: Int){
            progressBar.progress = suma/3
        }
    @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val obraz1 = findViewById<ImageView>(R.id.img1)
        val obraz2 = findViewById<ImageView>(R.id.img2)









        }
}































