package src.pt.ulusofona.cm.kotlin.challenge.models
import src.pt.ulusofona.cm.kotlin.challenge.models.Veiculo

class Carro(override val identificador: String, val motor: Motor) : Veiculo(identificador) {

    override fun toString(): String {
        return "Bicicleta | ${identificador} | ${dataDeAquisicao} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return true
    }
}