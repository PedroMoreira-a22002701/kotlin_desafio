package pt.ulusofona.cm.kotlin.challenge.interfaces
import pt.ulusofona.cm.kotlin.challenge.exceptions.*
import java.time.LocalDate
import src.pt.ulusofona.cm.kotlin.challenge.models.*
import src.pt.ulusofona.cm.kotlin.challenge.interfaces.*

interface Ligavel {
    fun ligar()

    fun desligar()

    fun estaLigado()

}