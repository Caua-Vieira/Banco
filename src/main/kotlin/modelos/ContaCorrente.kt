package modelos

class ContaCorrente(
    titular: String,
    cpf: String
) : Conta(
    titular = titular,
    cpf = cpf
) {
    override fun saca(valor: Double){
        val valorComTaxa = valor + (valor * 0.05)
        if(valorComTaxa <= this.saldo){
            this.saldo -= valorComTaxa
        }
    }
}