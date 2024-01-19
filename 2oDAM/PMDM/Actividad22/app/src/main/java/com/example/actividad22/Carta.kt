package com.example.actividad22

data class Carta(val palo:Palos , val numero:Numeros)


    fun main(){
        var carta = Numeros.OCHO de Palos.OROS
        println("La carta es el ${carta.numero} de ${carta.palo}")
    }
