import kotlin.math.pow
import java.math.BigInteger

fun main() {
    println("""
    1 - soma;
    2 - subtração;
    3 - multiplicação;
    4 - divisão;
    5 - modulo;
    6 - potenciação;
    7 - Fatorial;
    """)
    println("Escolha a operação que deseja executar: ")
    var operation = readLine()!!.toInt()
    if (operation == 7) {
        println("Digite o valor: ")
        val n1 = readLine()!!.toFloatOrNull()
        val resultOperacao = calculator(n1, null, operation)
        println(resultOperacao)
    } else {
        println("Digite o primeiro valor: ")
        val n1 = readLine()!!.toFloatOrNull()
        println("Digite o segundo valor: ")
        val n2 = readLine()!!.toFloatOrNull()
        val resultOperacao = calculator(n1, n2, operation)
        println(resultOperacao)
    }
}


fun fatorial(number: Int): BigInteger {
    var fator: BigInteger = BigInteger.ONE
    for (i in 1..number) {
        fator = fator.multiply(BigInteger.valueOf(i.toLong()))
    }
    return fator
}


fun calculator(n1: Float?, n2: Float?, operation: Int): Any? {
    val resultado = try{
        when(operation) {
            1 -> n1?.plus(n2!!)
            2 -> n1?.minus(n2!!)
            3 -> n1?.times(n2!!)
            4 -> n1?.div(n2!!)
            5 -> n1?.mod(n2!!)
            6 -> n1?.pow(n2!!)
            7 -> fatorial(n1!!.toInt())
            else -> "Opção invalída"
        }
    } catch (e: NullPointerException) {
        return "Por favor informe um valor válido!"
    }
    return resultado
}
