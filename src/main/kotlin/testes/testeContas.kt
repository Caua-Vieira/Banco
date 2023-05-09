package testes

import modelos.ContaCorrente

fun testeContas() {
    val caua = ContaCorrente(titular = "Cauã", cpf = "11111")
    val fran = ContaCorrente(titular = "Fran", cpf = "22222")

    caua.deposita(1000.0)
    caua.transfere(valor = 500.0, destino = fran)

    println("Saldo da fran após transferência: ${fran.saldo}")

    caua.saca(100.0)
    println(caua.saldo)
}