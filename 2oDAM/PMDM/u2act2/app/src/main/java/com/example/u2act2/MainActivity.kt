package com.example.u2act2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.button)
        var numero: Int = 0

        boton.setOnClickListener() {
            val contador: TextView = findViewById(R.id.Numero)
            numero++
            contador.text = numero.toString()

        }

    }
}