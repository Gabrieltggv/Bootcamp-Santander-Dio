package one.digitalinnovation.bank

import org.junit.Test
import kotlin.test.assertEquals

class PessoaTest {
    var testPessoa: Pessoa = Pessoa()

    @Test
    fun testName() {
        var esperado = "Gabriel Torres Gomes"
        assertEquals(esperado, testPessoa.nome)
    }
}
