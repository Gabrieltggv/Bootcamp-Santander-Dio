package one.digitalinnovation.bank


// A classe em kotlin pode conter cabeçalho ou mesmo o corpo definido entre chaves, caso não possua pode
// ser criada sem os mesmo. Ex: class Animal. 
// Caso a classe não possua anotações ou modificadores
// de visibilidade pode-se ser omitido a palavra constructor. 
// Ex: class Pessoa constructor(primero: String) {/*...*/}
// Caso contenha é necessário como no exemplo:

class Animal public constructor(tipo: String) {
    // &
   init { "Sou um animal do $tipo".also(:: println)}
    }
// No constructor primário não pode conter código deve ser colocados nos blocos
// inicializadores, com a palavra init, podendo conter varios init, sendo
//executados na ordem de definição.



class Pessoa() {
    var nome: String = "Gabriel Torres Gomes"
    var cpf: String = "584.763.245-82"

    init {
        "classe inicializada $nome".also(:: println)
    }

    inner class Endereco {
        var rua: String = "Rua ataulfo"
    }
}

