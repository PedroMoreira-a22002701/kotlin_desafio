package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter

class Carro(override val identificador: String, val motor: Motor) : Veiculo(identificador), Movimentavel {
    override fun toString(): String {
        val formatoData = SimpleDateFormat("dd-MM-yyyy")
        val dataFormatada = formatoData.format(dataDeAquisicao)
        return "Carro | ${identificador} | ${dataFormatada} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return true
    }


    override fun moverPara(x: Int, y: Int) {
        this.posicao.alterarPosicaoPara(x,y)
    }
}