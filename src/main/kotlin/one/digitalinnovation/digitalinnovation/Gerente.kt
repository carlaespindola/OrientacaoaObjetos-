package one.digitalinnovation.digitalinnovation

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel { //herança
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "senha123" == senha
}