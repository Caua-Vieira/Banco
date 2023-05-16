package modelos

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double){
        if(valor <= this.saldo){
            this.saldo -= valor
        }
    }
}