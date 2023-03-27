package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import src.pt.ulusofona.cm.kotlin.challenge.models.Posicao
import src.pt.ulusofona.cm.kotlin.challenge.models.Veiculo
import java.time.LocalDate

fun main(args: Array<String>) {
    val veiculos: MutableList<Veiculo> = mutableListOf()
    val veiculo1 = Veiculo("BMW")
    val veiculo2 = Veiculo("FIAT")
    veiculos.add(veiculo1)
    veiculos.add(veiculo2)
    val dataDeNascimento = LocalDate.parse("2001-06-15")
    val posicao = Posicao(0,0)
    val pessoa1 = Pessoa("Pedro",veiculos,dataDeNascimento, null, posicao)
    println(pessoa1.temCarta())
    println(pessoa1.tirarCarta())
    println(pessoa1.moverVeiculoPara("BMW",2,5))
    println(pessoa1.veiculos[0].posicao.toString())
    println(pessoa1.moverVeiculoPara("FIAT",2,5))
    println(pessoa1.venderVeiculo("BMW",Pessoa("NUNO", mutableListOf(),dataDeNascimento, null, posicao)))
    println(pessoa1.veiculos.toString())
    println(pessoa1.comprarVeiculo(Veiculo("FERRARI")))


}