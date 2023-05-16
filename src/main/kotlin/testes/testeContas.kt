package testes

import modelos.Cliente
import modelos.ContaCorrente
import modelos.ContaSalario

fun testeContas() {
    val caua = ContaCorrente(titular = Cliente(
        nome = "Cauã",
        cpf = "11111",
        senha = 123
    ),
        numero = 1000)

    val fran = ContaCorrente(
        titular = Cliente(
            nome = "Fran",
            cpf = "22222",
            senha = 12
        ),
        numero = 1002
    )

    caua.deposita(1000.0)
    caua.transfere(valor = 500.0, destino = fran)

    println("Saldo da fran após transferência: ${fran.saldo}")

    caua.saca(100.0)
    println("saldo de Cauã após saque: ${caua.saldo}")

    val joaoSalario = ContaSalario(
        titular = Cliente(
            nome = "João",
            cpf = "",
            senha = 3
        ),
        numero = 1003
    )

    joaoSalario.deposita(1000.0)
    println("\nSaldo de João após deposito na conta salario: ${joaoSalario.saldo}")

    fran.transfere(valor = 300.0, destino = joaoSalario)
    println("\n saldo de joão após transferencia recebida: ${joaoSalario.saldo}")

}