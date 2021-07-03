package one.digitalinnovation.digitalinnovation.testes
import one.digitalinnovation.digitalinnovation.Gerente

fun main() {

   val maria = Gerente("Maria do Carmo", "951.803.890-20", 5000.0, "senha123")
   ImprimeRelatorioFuncionario.Imprime(maria)

   TesteAutenticacao().autentica(maria)
}
