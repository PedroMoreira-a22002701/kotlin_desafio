package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter

class Carro(override val identificador: String, val motor: Motor) : Veiculo(identificador), Movimentavel, Ligavel {
    override fun toString(): String {
        val formatoData = SimpleDateFormat("dd-MM-yyyy")
        val dataFormatada = formatoData.format(dataDeAquisicao)
        return "Carro | ${identificador} | ${dataFormatada} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return true
    }
    override fun ligar() {
        if (!motor.ligado) {
            motor.ligar()

        }

        throw VeiculoLigadoException("Veiculo esta Ligado")
    }

    override fun desligar() {
        if (motor.ligado) {
            motor.desligar()
        }
        throw VeiculoDesligadoException("Veiculo esta Desligado")
    }

    override fun estaLigado(): Boolean {
        return motor.estaLigado()
    }


    override fun moverPara(x: Int, y: Int) {
        this.posicao.alterarPosicaoPara(x,y)
    }
}