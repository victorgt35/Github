package com.example.actividad5ud2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var operacion: OPERACION = OPERACION.NONE
        var nuevoNumero = true
        var resultadoParcial: String = "0"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvOrigen: TextView = findViewById(R.id.tvOrigen)
        val btComa: Button = findViewById(R.id.btComa)
        val bt0: Button = findViewById(R.id.bt0)
        val bt1: Button = findViewById(R.id.bt1)
        val bt2: Button = findViewById(R.id.bt2)
        val bt3: Button = findViewById(R.id.bt3)
        val bt4: Button = findViewById(R.id.bt4)
        val bt5: Button = findViewById(R.id.bt5)
        val bt6: Button = findViewById(R.id.bt6)
        val bt7: Button = findViewById(R.id.bt7)
        val bt8: Button = findViewById(R.id.bt8)
        val bt9: Button = findViewById(R.id.bt9)
        val btMas: Button = findViewById(R.id.btMas)
        val btMenos: Button = findViewById(R.id.btMenos)
        val btPor: Button = findViewById(R.id.btPor)
        val btDiv: Button = findViewById(R.id.btDiv)
        val btIgual: Button = findViewById(R.id.btIgual)
        val btCE: Button = findViewById(R.id.btCE)
        val btC: Button = findViewById(R.id.btC)
        bt0.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt1.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt2.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt3.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt4.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt5.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt6.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt7.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt8.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        bt9.setOnClickListener() {
            pulsacionBotonNumero((it as Button), tvOrigen)
        }
        // Pulsación de decimal
        btComa.setOnClickListener() {
            // si hay una coma ya, no se hace nada
            if (!tvOrigen.text.toString().contains('.'))
                if (!nuevoNumero)
                    tvOrigen.text = tvOrigen.text.toString() + "."
                else {
                    tvOrigen.text = "."
                    nuevoNumero = false
                }
        }
        // Pulsación de operaciones
        btMas.setOnClickListener() {
            pulsacionOperacion(OPERACION.SUM, tvOrigen)
        }
        btMenos.setOnClickListener() {
            pulsacionOperacion(OPERACION.RES, tvOrigen)
        }
        btPor.setOnClickListener() {
            pulsacionOperacion(OPERACION.MUL, tvOrigen)
        }
        btDiv.setOnClickListener() {
            pulsacionOperacion(OPERACION.DIV, tvOrigen)
        }
        btIgual.setOnClickListener() {
            pulsacionOperacion(OPERACION.IGUAL, tvOrigen)
        }
        // Pulsación CE y C
        btCE.setOnClickListener() {
            tvOrigen.text = "0"
            nuevoNumero = true
        }
        btC.setOnClickListener() {
            tvOrigen.text = "0"
            operacion = OPERACION.NONE
            resultadoParcial = "0"
            nuevoNumero = true
        }

        fun pulsacionBotonNumero(boton: Button, texto_origen: TextView) {
            if (texto_origen.text.toString().equals("0") && boton.text.toString().equals("0"))
                return
            if (!nuevoNumero)
                texto_origen.text = texto_origen.text.toString() + boton.text.toString()
            else {
                texto_origen.text = boton.text.toString()
                nuevoNumero = false
            }
        }

        fun pulsacionOperacion(operacion: OPERACION, origen: TextView) {
            if (this.operacion == OPERACION.NONE) {
                this.operacion = operacion
                resultadoParcial = origen.text.toString()
                nuevoNumero = true
            } else {
                origen.text =
                    obtenerResultado(origen.text.toString(), resultadoParcial, this.operacion)
                if (operacion != OPERACION.IGUAL) {
                    this.operacion = operacion
                    resultadoParcial = origen.text.toString()
                } else {
                    this.operacion = OPERACION.NONE
                    resultadoParcial = "0"
                }
                nuevoNumero = true
            }
        }

        fun obtenerResultado(operando1: String, operando2: String, operacion: OPERACION): String {
            val op1 = operando1.toFloat()
            val op2 = operando2.toFloat()
            var resultado = 0F
            when (operacion) {
                OPERACION.SUM -> resultado = op1 + op2
                OPERACION.RES -> resultado = op2 - op1
                OPERACION.MUL -> resultado = op1 * op2
                OPERACION.DIV -> resultado = op2 / op1
                OPERACION.NONE -> resultado = op1
                OPERACION.IGUAL -> resultado = op1
            }
            return mostrarFloat(resultado)
        }

        fun mostrarFloat(num: Float): String {
            if (num.toInt().toFloat() == num)
                return num.toInt().toString()
            else
                return num.toString()
        }
    }

}

enum class OPERACION {
    NONE, SUM, RES, MUL, DIV, IGUAL
}
