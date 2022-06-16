package one.digitalinnovation.bank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
): Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): BigDecimal

    override fun toString(): String = """
        ${nome()},
        cpf: $cpf,
        salario: $salario,
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}
