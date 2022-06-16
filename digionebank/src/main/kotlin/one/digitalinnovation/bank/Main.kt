
package one.digitalinnovation.bank


fun main(){
    var digionebank = Banco(nome="America", numero=14)
    var digionebank2 = digionebank.copy(numero=17)
    println(digionebank.info())
    println(digionebank2.info())

}
