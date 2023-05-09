package modelos

class ContaPoupanca(
    titular: String,
    cpf: String
) : ContaTransferivel(
    titular = titular,
    cpf = cpf
) {

    override fun saca(valor: Double){
        if(valor <= this.saldo){
            this.saldo -= valor
        }
    }
}