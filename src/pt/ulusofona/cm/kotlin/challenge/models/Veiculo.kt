package src.pt.ulusofona.cm.kotlin.challenge.models;

import src.pt.ulusofona.cm.kotlin.challenge.models.Posicao
import java.util.Date

open class Veiculo(open val identificador: String) {
    var posicao: Posicao? = Posicao(0,0)
    var dataDeAquisicao: Date? = Date()

    fun requerCarta(): Boolean {
        return false // replace with your logic
    }
}