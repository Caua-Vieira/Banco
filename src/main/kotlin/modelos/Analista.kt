package modelos

class Analista (
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double = salario * 0.03
}