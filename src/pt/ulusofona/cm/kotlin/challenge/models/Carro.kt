package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro(override val identificador: String, val motor: Motor) : Veiculo(identificador), Ligavel, Movimentavel {
    override fun toString(): String {
        return "Carro | ${identificador} | ${dataDeAquisicao} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return true
    }

    override fun ligar() {
        this.motor.ligado = true
    }

    override fun desligar() {
        this.motor.ligado = false
    }

    override fun estaLigado(): Boolean {
        return this.motor.ligado
    }

    override fun moverPara(x: Int, y: Int) {
        this.posicao.alterarPosicaoPara(x,y)
    }
}