package modelos

class ContaSalario(
    titular: String,
    cpf: String
) : Conta(
    titular = titular,
    cpf = cpf
) {
    override fun saca(valor: Double) {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
    }
}