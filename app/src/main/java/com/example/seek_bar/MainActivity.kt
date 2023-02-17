package com.example.seek_bar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
            progressBar.progress = suma/2
        }
    @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val obraz1 = findViewById<ImageView>(R.id.img1)
        val obraz2 = findViewById<ImageView>(R.id.img2)

        val obraz1_poziom = findViewById<SeekBar>(R.id.poziom1)
        val obraz1_pion = findViewById<SeekBar>(R.id.pion1)
        val obraz2_poziom = findViewById<SeekBar>(R.id.poziom2)
        val obraz2_pion = findViewById<SeekBar>(R.id.pion2)

        val reset = findViewById<Button>(R.id.reset)
        val progress_poziom = findViewById<ProgressBar>(R.id.pbpoziom)
        val progress_pion = findViewById<ProgressBar>(R.id.pbpion)


        reset.setOnClickListener() {
            obraz1_pion.progress = 0
            obraz2_pion.progress = 0

            obraz1_poziom.progress = 0
            obraz2_poziom.progress = 0


        }

            obraz1_pion.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar,progres: Int, fromUser: Boolean) {
                    val scale = progres / 100f
                    obraz1.scaleY = scale
                    changed(progress_pion, suma_pionu())
                }


                    override fun onStartTrackingTouch(seekBar: SeekBar) {}
                    override fun onStopTrackingTouch(seekBar: SeekBar) {}
                })

                obraz1_poziom.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar,progres: Int, fromUser: Boolean) {
                        val scale = progres/100f
                        obraz1.scaleX = scale
                        changed(progress_poziom, suma_poziomu())
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar) {}
                    override fun onStopTrackingTouch(seekBar: SeekBar) {}
                })

                obraz2_poziom.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar,progres: Int, fromUser: Boolean) {
                        val scale = progres/100f
                        obraz2.scaleX = scale
                        changed(progress_poziom, suma_poziomu())
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar) {}
                    override fun onStopTrackingTouch(seekBar: SeekBar) {}
                })

                obraz2_pion.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(seekBar: SeekBar,progres: Int, fromUser: Boolean) {
                        val scale = progres/100f
                        obraz2.scaleY = scale
                        changed(progress_pion, suma_pionu())
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar) {}
                    override fun onStopTrackingTouch(seekBar: SeekBar) {}
                })


        }









        }
































