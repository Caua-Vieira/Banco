package modelos

class Cliente(
    val nome: String,
    val endereco: Endereco = Endereco(),
    val cpf: String,
    val senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if(senha == this.senha){
            return true
        }
        return false
    }

}