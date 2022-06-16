package one.digitalinnovation.colecoes

import java.util.Arrays

fun main() {
    val lista = IntArray(5)
    var cont = 0

    for (valor in lista) {
        lista[cont] = cont + 1
        cont ++
    }

    println(Arrays.toString(lista))

    lista.forEach{ elemento ->
        println(elemento)
    }
}
