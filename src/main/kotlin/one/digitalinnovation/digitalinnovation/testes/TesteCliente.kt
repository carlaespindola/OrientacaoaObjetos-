package one.digitalinnovation.digitalinnovation.testes
import one.digitalinnovation.digitalinnovation.Cliente
import one.digitalinnovation.digitalinnovation.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.123.123.-12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}