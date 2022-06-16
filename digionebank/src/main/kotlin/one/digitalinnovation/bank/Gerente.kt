package one.digitalinnovation.bank

import java.math.BigDecimal

class Gerente(
        nome: String,
        cpf: String,
        salario: BigDecimal,
        var senha: String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calculoAuxilio(): BigDecimal = salario * BigDecimal.valueOf(0.4)
    override fun login(): Boolean = "abc123" == senha
}
