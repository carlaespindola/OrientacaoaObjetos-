package one.digitalinnovation.digitalinnovation.testes
import one.digitalinnovation.digitalinnovation.Banco

fun main() {
    val digiOneBank = Banco( nome = "DigiOne", numero = 12)

    //println(digiOneBank.nome)
    //println(digiOneBank.numero)

    //digiOneBank.nome = "Teste" (não tem como setar, não há como mudar o nome do banco - exceto se for var)

    val banco2 = digiOneBank.copy(nome = "Teste") //manipulando uma copia

    println(banco2.info())
    //println(banco2.numero)

}