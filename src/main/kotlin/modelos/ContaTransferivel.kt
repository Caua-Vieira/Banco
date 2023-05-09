package modelos

abstract class ContaTransferivel(
    titular: String,
    cpf: String
) : Conta(
    titular = titular,
    cpf = cpf
) {
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (valor <= this.saldo) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}