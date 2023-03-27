package src.pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.exceptions.*
import java.time.LocalDate
import src.pt.ulusofona.cm.kotlin.challenge.models.*
import src.pt.ulusofona.cm.kotlin.challenge.interfaces.*

class Posicao(var x: Int, var y: Int) {

    fun alterarPosicaoPara(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
    override fun toString(): String {
        return "Posicao | x:${x} | y:${y}"
    }
}