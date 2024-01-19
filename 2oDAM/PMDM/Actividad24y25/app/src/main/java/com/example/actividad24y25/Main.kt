package com.example.actividad24y25

public fun main() {
    val compra: Compra = Compra()
    compra.manejarLista()
    compra.mutarLista()

}

class Compra {
    var lista = arrayOf("Te", "Huevos", "Leche")
    public fun manejarLista() { //Actividad 24

        println("Lista de la compra: ${listaAString()}")
        lista += "Te"
        lista += "Galletas"
        lista += "Azúcar"
        println("Lista de la compra con los elementos añadidos: ${listaAString()}")
        for (elemento in lista) {
            if (lista.indexOf("Te") != -1)
                lista.set(lista.indexOf("Te"), "Café")
        }
        lista.sort()
        println("Lista ordenada de la compra: ${listaAString()}")
        lista.reverse()
        println("Lista invertida de la compra: ${listaAString()}")

    }

    public fun mutarLista() {
        var listaMutable = lista.toMutableList()
        println("Lista mutable: ${listaMutable}")
        val listaInmutable = listOf("Cebollas", "Espinacas", "Leche")
        listaMutable += listaInmutable
        println("Lista mutable + inmutable ${listaMutable}")

    }


    public fun listaAString(): String {
        var listaString: String = ""
        var i = 0
        for (elemento in lista) {

            if (elemento == lista[lista.size - 1]) {
                listaString += elemento + "]"
            } else if (i == 0) {
                listaString += "[" + elemento + ", "
                i++
            } else
                listaString += elemento + ", "

        }

        return listaString
    }


}