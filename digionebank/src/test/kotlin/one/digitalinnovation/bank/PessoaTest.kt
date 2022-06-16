package one.digitalinnovation.bank

import org.junit.Test
import kotlin.test.assertEquals
import java.math.BigDecimal

class PessoaTest {
    var testPessoa: Analista = Analista(
                                nome = "Gabriel Torres", 
                                cpf= "234.568.344-92",
                                salario = BigDecimal(1000)
                            )

    @Test
    fun testName() {
        var esperado: String = "Meu nome é Gabriel Torres"
        assertEquals(esperado, testPessoa.nome())
    }
}
