package com.example.u2act1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBoton: Button = findViewById(R.id.botonHola)

        miBoton.setOnClickListener() {
            val nombreIntroducido: TextView = findViewById(R.id.textoEscribirNombre)

            Toast.makeText(this, "Hola ${nombreIntroducido.text}", Toast.LENGTH_LONG).show()
        }

    }


}