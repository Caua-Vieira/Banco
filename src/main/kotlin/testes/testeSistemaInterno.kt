package testes

import modelos.Diretor
import modelos.SistemaInterno

fun testeSistemaInterno() {
    val joao = Diretor(
        nome = "João",
        cpf = "111.111.111-11",
        salario = 3000.0,
        senha = 1234
    )

    val SI = SistemaInterno()

    if (SI.entra(joao, 124)) {
        println("Bem vindo ao banco ${joao.nome}")
    } else {
        println("Falha na autenticação")
    }
}
