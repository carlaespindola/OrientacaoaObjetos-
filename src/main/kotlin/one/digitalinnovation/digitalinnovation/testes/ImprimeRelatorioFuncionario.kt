package one.digitalinnovation.digitalinnovation.testes
import one.digitalinnovation.digitalinnovation.Funcionario

class ImprimeRelatorioFuncionario {
    //companion object: metodo estatico, invocado via classe e não instancia
    companion object {
        fun Imprime (funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}