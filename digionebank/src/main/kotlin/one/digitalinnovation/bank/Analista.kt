package one.digitalinnovation.bank

import java.math.BigDecimal

class Analista(
        nome: String,
        cpf: String,
        salario: BigDecimal
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio(): BigDecimal = salario * BigDecimal.valueOf(0.1)
}
