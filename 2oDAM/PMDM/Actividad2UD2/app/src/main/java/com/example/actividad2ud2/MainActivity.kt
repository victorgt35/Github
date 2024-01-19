package com.example.actividad2ud2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonContador: Button = findViewById(R.id.buttonContador)
        val contador: TextView = findViewById(R.id.contador)
        var numero: Int = contador.text.toString().toInt()

        buttonContador.setOnClickListener() {
            numero++
            contador.text = numero.toString()
        }
    }
}