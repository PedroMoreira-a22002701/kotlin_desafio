package pt.ulusofona.cm.kotlin.challenge.models;
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat

abstract class Bicicleta(override var identificador: String) : Veiculo(identificador), Movimentavel, Ligavel{
    override fun toString(): String {
        val formatoData = SimpleDateFormat("dd-MM-yyyy")
        val dataFormatada = formatoData.format(dataDeAquisicao)
        return "Bicicleta | ${identificador} | ${dataFormatada} | "+ posicao.toString()
    }
    abstract override fun ligar()
    abstract override fun desligar()

    abstract override fun estaLigado(): Boolean
    override fun requerCarta(): Boolean {
        return false
    }
    override fun moverPara(x: Int, y: Int) {
        this.posicao.alterarPosicaoPara(x,y)
    }
}