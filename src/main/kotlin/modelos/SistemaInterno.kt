package modelos

class SistemaInterno {

    fun entra(pessoa: Autenticavel, senha: Int): Boolean{
        if(pessoa.autentica(senha)){
            return true
        }
        return false
    }
}