package pt.ulusofona.cm.kotlin.challenge.models;
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat

class Bicicleta(override var identificador: String) : Veiculo(identificador), Movimentavel{
    override fun toString(): String {
        val formatoData = SimpleDateFormat("dd-MM-yyyy")
        val dataFormatada = formatoData.format(dataDeAquisicao)
        return "Bicicleta | ${identificador} | ${dataDeAquisicao} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return false
    }
    override fun moverPara(x: Int, y: Int) {
        this.posicao.alterarPosicaoPara(x,y)
    }
}