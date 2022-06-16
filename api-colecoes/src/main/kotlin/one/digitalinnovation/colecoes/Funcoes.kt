package one.digitalinnovation.colecoes

import java.util.Arrays

fun doubleOperacoes() {
    val salarios = doubleArrayOf(2000.0, 5000.0, 1500.0)
    val minimo = salarios.minOrNull()
    val maximo = salarios.maxOrNull()
    val media = salarios.average()
    val salariosPar = salarios.filter{ it < media }

    println("Valor minimo: $minimo")

    println("Valor maximo: $maximo")
    println("Valor media: $media")
    println(salariosPar)


    println(salarios.count{it % 3 == 0.0})
    println(salarios.find{ it in minimo!!.rangeTo(media) })
    println(salarios.find{it == 500.0}) // return null
    println(salarios.any{it == 1500.0}) // return False
    println(salarios.any{it == 300.0}) // return False
}

