package one.digitalinnovation.bank

import org.junit.Test
import kotlin.test.assertContains
import kotlin.collections.listOf
import java.sql.ClientInfoStatus


class ClientTipoTest {
    val client = ClientTipo.values()
    val elementos = listOf("PJ","PF")

    @Test
    fun testEnum(){
        client.forEach {
            assertContains(elementos, it.name)
        }
    }

}
