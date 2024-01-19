package com.example.actividad1ud2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nombre:EditText = findViewById(R.id.editNombre)
        var buttonGreet:Button = findViewById(R.id.buttonGreet)
        buttonGreet.setOnClickListener(){
            Toast.makeText(this, "¡Hola ${nombre.text}!", Toast.LENGTH_LONG).show()
        }

    }
}