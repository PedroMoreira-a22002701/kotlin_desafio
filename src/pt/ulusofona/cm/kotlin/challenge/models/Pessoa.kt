package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.exceptions.*
import java.time.LocalDate

import java.util.*


class Pessoa(val nome: String, val dataDeNascimento: Date) {
    var veiculos: MutableList<Veiculo> = mutableListOf()
    var carta: Carta? = null
    var posicao = Posicao(0,0)
    fun comprarVeiculo(veiculo: Veiculo) {
        veiculos.add(veiculo)
    }
    fun pesquisarVeiculo(identificador: String): Veiculo {
        for (veiculo in veiculos) {
            if (veiculo.identificador == identificador) {
                return veiculo
            }
        }

        throw VeiculoNaoEncontradoException("Veículo com identificador $identificador não encontrado")

    }
    fun venderVeiculo(identificador: String, comprador: Pessoa) {
        // Encontra o veículo pelo identificador
        val veiculo = pesquisarVeiculo(identificador)
        // Remove o veículo da lista de veículos da pessoa que o possui
        veiculos.remove(veiculo)

        // Verifica se o comprador já possui o veículo e lança uma exceção se sim
        if (comprador.veiculos.contains(veiculo)) {
            throw IllegalStateException("O comprador já possui este veículo.")
        }

        // Transfere a propriedade do veículo para o comprador
        comprador.comprarVeiculo(veiculo)

        // Define o novo dono do veículo

    }
    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {
        val veiculo = pesquisarVeiculo(identificador)
        veiculo.posicao?.alterarPosicaoPara(x,y)

    }
    fun tirarCarta() {
        if (carta != null) {
            throw RuntimeException("A pessoa já possui uma carta.")
        }
        if (LocalDate.now().year - dataDeNascimento.year < 18) {
            throw MenorDeIdadeException("A pessoa é menor de idade e não pode tirar a carta.")
        }
        carta = Carta()
    }

    fun temCarta(): Boolean {
        return carta != null
    }



    override fun toString(): String {
        return "Pessoa | ${nome} | ${dataDeNascimento} | " + posicao.toString()
    }
}