package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.*
class Carro(override val identificador: String, val motor: Motor) : Veiculo(identificador) {

    override fun toString(): String {
        return "Bicicleta | ${identificador} | ${dataDeAquisicao} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return true
    }
}