package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*
import pt.ulusofona.cm.kotlin.challenge.interfaces.*
import pt.ulusofona.cm.kotlin.challenge.exceptions.*


import java.time.LocalDate
import java.util.*

fun main(args: Array<String>) {
    val veiculos: MutableList<Veiculo> = mutableListOf()
    val veiculo1 = Carro("BMW", Motor(3,3))
    val veiculo2 = Bicicleta("FIAT")
    veiculo1.motor.ligar()
    veiculo1.motor.ligar()



}