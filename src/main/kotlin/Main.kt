import modelos.Cliente
import modelos.ContaCorrente
import modelos.Endereco
import testes.testeContas

fun main() {

    val endereco = Endereco(
        logradouro = "Vila velha",
        numero = 2,
        cep = "18140-506"
    )

    val novoEndereco = endereco

    val teste = Cliente(
        nome = "CAUA",
        cpf = "",
        senha = 1
    )

    println(teste.autentica(0))

    println(endereco.toString())
    println(endereco.equals(novoEndereco))

}




