package testes

import modelos.Diretor
import modelos.Gerente

fun testeFuncionarios() {
    val carlos = Gerente(
        nome = "Carlos",
        cpf = "",
        salario = 2000.0,
        senha = 123
    )

    val joao = Diretor(
        nome = "João",
        cpf = "",
        salario = 3000.0,
        senha = 1234
    )


    println(carlos.autentica(13))
    println(carlos.calculadora())

    println(joao.calculadora())
}
