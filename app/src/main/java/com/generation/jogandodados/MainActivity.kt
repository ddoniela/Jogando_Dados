package com.generation.jogandodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        buttonD6.setOnClickListener {
            rolarDados(6)
        }

        val buttonD12 = findViewById<Button>(R.id.buttonD12)

        buttonD12.setOnClickListener {
            rolarDados2(12)
        }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD20.setOnClickListener {
            rolarDados3(20)
        }
    }

    private fun rolarDados3(lados3: Int) {
        val rolagem3 = (1..lados3).random()

        val textDado3 = findViewById<TextView>(R.id.textDado3)

        textDado3.text = rolagem3.toString()

        val image = findViewById<ImageView>(R.id.imageLados3)

        when(rolagem3){

            1 -> image.setImageResource(R.drawable.d20_1)
            2 -> image.setImageResource(R.drawable.d20_2)
            3 -> image.setImageResource(R.drawable.d20_3)
            4 -> image.setImageResource(R.drawable.d20_4)
            5 -> image.setImageResource(R.drawable.d20_5)
            6 -> image.setImageResource(R.drawable.d20_6)
            7 -> image.setImageResource(R.drawable.d20_7)
            8 -> image.setImageResource(R.drawable.d20_8)
            9 -> image.setImageResource(R.drawable.d20_9)
            10 -> image.setImageResource(R.drawable.d20_10)
            11 -> image.setImageResource(R.drawable.d20_11)
            12 -> image.setImageResource(R.drawable.d20_12)
            13 -> image.setImageResource(R.drawable.d20_13)
            14 -> image.setImageResource(R.drawable.d20_14)
            15 -> image.setImageResource(R.drawable.d20_15)
            16 -> image.setImageResource(R.drawable.d20_16)
            17 -> image.setImageResource(R.drawable.d20_17)
            18 -> image.setImageResource(R.drawable.d20_18)
            19 -> image.setImageResource(R.drawable.d20_19)
            20 -> image.setImageResource(R.drawable.d20_20)

        }
    }

    private fun rolarDados2(lados2: Int) {
        val rolagem2 = (1..lados2).random()

        val textDado2 = findViewById<TextView>(R.id.textDado2)

        textDado2.text = rolagem2.toString()

        val image = findViewById<ImageView>(R.id.imageLados2)

        when(rolagem2){

            1 -> image.setImageResource(R.drawable.dado_1)
            2 -> image.setImageResource(R.drawable.dado_2)
            3 -> image.setImageResource(R.drawable.dado_3)
            4 -> image.setImageResource(R.drawable.dado_4)
            5 -> image.setImageResource(R.drawable.dado_5)
            6 -> image.setImageResource(R.drawable.dado_6)
            7 -> image.setImageResource(R.drawable.dado_7)
            8 -> image.setImageResource(R.drawable.dado_8)
            9 -> image.setImageResource(R.drawable.dado_9)
            10 -> image.setImageResource(R.drawable.dado_10)
            11 -> image.setImageResource(R.drawable.dado_11)
            12 -> image.setImageResource(R.drawable.dado_12)

        }
    }

    private fun rolarDados(lados: Int){
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageLados)

        when(rolagem){

            1 -> image.setImageResource(R.drawable.lado_1)
            2 -> image.setImageResource(R.drawable.lado_2)
            3 -> image.setImageResource(R.drawable.lado_3)
            4 -> image.setImageResource(R.drawable.lado_4)
            5 -> image.setImageResource(R.drawable.lado_5)
            6 -> image.setImageResource(R.drawable.lado_6)

        }

    }
}