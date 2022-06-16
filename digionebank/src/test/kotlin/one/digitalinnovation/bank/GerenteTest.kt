package one.digitalinnovation.bank

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import java.math.BigDecimal

class GerenteTest {
    var paulo: Gerente = Gerente(
                                    nome="Paulo Martins",
                                    cpf="555.785.864-87",
                                    salario= BigDecimal.valueOf(7000),
                                    senha="abc123"
                                )
    var relatorio = """
        Meu nome é Paulo Martins,
        cpf: 555.785.864-87,
        salario: 7000,
        Auxilio: 2800.0
    """.trimIndent()


    @Test
    fun testStringRelatorio() {
        assertEquals(relatorio, paulo.toString())
    }

    @Test
    fun testAutenticadoRelatorio() {
        assertTrue(paulo.login())
    }
}
