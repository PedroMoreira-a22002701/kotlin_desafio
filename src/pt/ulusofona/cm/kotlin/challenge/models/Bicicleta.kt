package pt.ulusofona.cm.kotlin.challenge.models;

class Bicicleta(override var identificador: String) : Veiculo(identificador){
    override fun toString(): String {
        return "Bicicleta | ${identificador} | ${dataDeAquisicao} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return false
    }
}