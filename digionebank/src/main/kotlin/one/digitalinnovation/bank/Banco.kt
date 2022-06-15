package one.digitalinnovation.bank


data class Banco(
    val nome: String,
    val numero: Int,
){
    // O conceito de data class é criar um objeto imutável, apenas
    // é possível alterar seu estado através de uma copia.
    fun info() = "$nome - $numero"
}
