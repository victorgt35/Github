package com.example.actividad23

fun main() {
    var temperatura = Temperatura(10.1F, Escala.CELSIUS)
    println(temperatura.toString())
    temperatura.convertirAF()
    println(temperatura.toString())
    temperatura.convertirAK()
    println(temperatura.toString())
    temperatura.convertirAC()
    println(temperatura.toString())
    var temperatura2 = temperatura.copy(Escala.FARENHEITH)
    println("temperatura 2-->" + temperatura2.toString())
    println("temperatura 1-->" + temperatura.toString())

}