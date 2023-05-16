package modelos

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo: Double = 0.0
        protected set

    companion object{
        var total = 0
            private set
    }

    init {
        total++
    }

    abstract fun saca(valor: Double)

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun realizaOperacao(senha: Int) : Boolean {
        if(titular.autentica(senha)){
            return true
        }
        return false
    }

}