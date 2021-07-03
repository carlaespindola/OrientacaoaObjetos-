package one.digitalinnovation.digitalinnovation

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome:$nome
        CPF:$cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}