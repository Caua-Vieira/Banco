package modelos

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    var total: Double = 0.0

    abstract val bonificacao: Double

    fun calculadora() : Double{
        this.total = this.salario + this.bonificacao
        return total
    }
}