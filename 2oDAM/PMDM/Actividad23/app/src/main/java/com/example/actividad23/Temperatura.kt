package com.example.actividad23

class Temperatura(var grados: Float, var escala: Escala) {

    fun convertirAF() {
        if (this.escala == Escala.CELSIUS) {
            this.grados = (this.grados * 9 / 5) + 32
            this.escala = Escala.FARENHEITH
        } else {
            this.grados = ((this.grados - 273.15F) * 9 / 5 + 32)
            this.escala = Escala.FARENHEITH
        }
    }

    fun convertirAC() {
        if (this.escala == Escala.FARENHEITH) {
            this.grados = ((this.grados - 32) * 5 / 9 + 273.15F)
            this.escala = Escala.CELSIUS
        } else {
            this.grados = ((this.grados - 273.15F))
            this.escala = Escala.CELSIUS
        }
    }

    fun convertirAK() {
        if (this.escala == Escala.CELSIUS) {
            this.grados = ((this.grados + 273.15F))
            this.escala = Escala.KELVIN
        } else {
            this.grados = ((this.grados - 32) * 5 / 9 + 273.15F)
            this.escala = Escala.KELVIN
        }
    }

    fun copy(escala: Escala): Temperatura {
        var temp: Temperatura = Temperatura(this.grados, this.escala)
        if (escala == Escala.CELSIUS) {
            temp.convertirAC()
        }
        if (escala == Escala.KELVIN) {
            temp.convertirAK()
        }
        if (escala == Escala.FARENHEITH) {
            temp.convertirAF()
        }
        return temp
    }

    override fun toString(): String {
        return ("grados= ${this.grados}, escala= ${this.escala}")
    }
}