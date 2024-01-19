package com.example.actividad2

fun main() {
    val notif1 = 75
    val notif2 = 135
    println("Imprime menos de 100 - Ejemplo: " + notif1 + " : " + numNotificacionesResumen(notif1))
    println("Imprime mas de 100 - Ejemplo: " + notif2 + " : " + numNotificacionesResumen(notif2))
}

fun numNotificacionesResumen(notifificacionesReales: Int): String {
    if (notifificacionesReales > 99) {
        return "99+"
    } else {
        return notifificacionesReales.toString()
    }
}
