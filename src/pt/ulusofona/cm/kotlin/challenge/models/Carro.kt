package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro(override val identificador: String, val motor: Motor) : Veiculo(identificador), Movimentavel {
    override fun toString(): String {
        return "Carro | ${identificador} | ${dataDeAquisicao} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return true
    }


    override fun moverPara(x: Int, y: Int) {
        this.posicao.alterarPosicaoPara(x,y)
    }
}