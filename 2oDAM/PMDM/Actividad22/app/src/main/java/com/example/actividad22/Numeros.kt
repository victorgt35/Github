package com.example.actividad22

enum class Numeros {
    UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, SOTA, CABALLO, REY;

    infix fun de(palo: Palos): Carta {
        return Carta(palo, this)
    }

}