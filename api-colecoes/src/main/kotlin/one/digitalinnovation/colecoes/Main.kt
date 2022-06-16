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

    "IntArrayOf".also(:: println)

    val inteiros = intArrayOf(1, 2, 7, 8, 10)
    inteiros.sort()
    println(Arrays.toString(inteiros))

    "Array de string".also(:: println)

    val nomes = Array(3){""} // {""} esta inferindo o tipo
    nomes[0] = "Elefante"
    nomes[1] = "Abelha"
    nomes[2] = "Cachorro"

    val animais = arrayOf("Galinha", "tubarão")


    animais.forEachIndexed { index, ele ->
        "nome[$index] = $ele".also(:: println)
    }

    "DoubleArray".also(:: println)

    val salarios = DoubleArray(3)
    salarios[0] = 3000.0
    salarios[1] = 400.0
    salarios[2] = 500.0

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario + 4.5
        println(salarios[index])
    }

    doubleOperacoes()

}
