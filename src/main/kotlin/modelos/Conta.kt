package modelos

abstract class Conta(
    val titular: String,
    val cpf: String,
) {
    var saldo: Double = 0.0
        protected set

    abstract fun saca(valor: Double)

    fun deposita(valor:Double){
        if(valor > 0){
            this.saldo += valor
        }
    }

    fun transfere(valor: Double, destino: Conta) : Boolean{
        if(valor <= this.saldo){
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}