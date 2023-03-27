package src.pt.ulusofona.cm.kotlin.challenge.models;
import pt.ulusofona.cm.kotlin.challenge.exceptions.*
import java.time.LocalDate
import src.pt.ulusofona.cm.kotlin.challenge.models.*
import src.pt.ulusofona.cm.kotlin.challenge.interfaces.*
import java.util.Date

abstract class Veiculo(open val identificador: String) {
    var posicao: Posicao? = Posicao(0,0)
    var dataDeAquisicao: Date? = Date()

    abstract fun requerCarta(): Boolean
}