package pt.ulusofona.cm.kotlin.challenge.models;
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
class Bicicleta(override var identificador: String) : Veiculo(identificador), Movimentavel{
    override fun toString(): String {
        return "Bicicleta | ${identificador} | ${dataDeAquisicao} | "+ posicao.toString()
    }

    override fun requerCarta(): Boolean {
        return false
    }
    override fun moverPara(x: Int, y: Int) {
        this.posicao.alterarPosicaoPara(x,y)
    }
}