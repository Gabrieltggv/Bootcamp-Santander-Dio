package one.digitalinnovation.bank

import org.junit.Test
import kotlin.test.assertEquals
import java.math.BigDecimal

class AnalistaTest {
    var testAnalista: Analista = Analista(
                                    nome="Geraldo Martins",
                                    cpf="555.555.864-87",
                                    salario= BigDecimal.valueOf(4000)
                                )
    var relatorio = """
        Meu nome é Geraldo Martins,
        cpf: 555.555.864-87,
        salario: 4000,
        Auxilio: 400.0
    """.trimIndent()


    @Test
    fun testStringRelatorio() {
        assertEquals(relatorio, testAnalista.toString())
    }
}
