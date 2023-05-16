package modelos

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double){
        val valorComTaxa = valor + (valor * 0.05)
        if(valorComTaxa <= this.saldo){
            this.saldo -= valorComTaxa
        }
    }
}