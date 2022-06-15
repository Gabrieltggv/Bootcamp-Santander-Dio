
package one.digitalinnovation.bank


fun main(){
    val gabriel = Pessoa()
    var digionebank = Banco(nome="America", numero=14)
    var digionebank2 = digionebank.copy(numero=17)
    println(gabriel.nome)
    println(gabriel.cpf)
    println(gabriel.Endereco().rua)
    Animal(tipo="Mamífero")
    println(digionebank.info())
    println(digionebank2.info())

}
