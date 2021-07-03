package one.digitalinnovation.digitalinnovation

//Funcionario herda as informações/propriedades de Pessoa
abstract class Funcionario(
     nome: String,
     cpf: String,
     val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
        """.trimEnd()
}