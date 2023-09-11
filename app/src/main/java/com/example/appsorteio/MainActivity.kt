package com.example.appsorteio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @SuppressLint("SetTextI18n")
    fun sortearNumero(view: View){

        var texto = findViewById<TextView>(R.id.textoSorteio)
        val randomValues = List(1) {Random.nextInt(0, 10)}
        texto.text = "O  número sorteado é: $randomValues"
    }
}