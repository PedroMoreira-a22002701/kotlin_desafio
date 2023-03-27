package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*


import java.time.LocalDate

fun main(args: Array<String>) {
    val veiculos: MutableList<Veiculo> = mutableListOf()
    val veiculo1 = Carro("BMW", Motor(3,3))
    val veiculo2 = Bicicleta("FIAT")
    veiculos.add(veiculo1)
    veiculos.add(veiculo2)
    val dataDeNascimento = LocalDate.parse("2001-06-15")
    val posicao = Posicao(0,0)
    val pessoa1 = Pessoa("Pedro",dataDeNascimento)
    println(pessoa1.temCarta())
    println(pessoa1.tirarCarta())
    println(pessoa1.comprarVeiculo(Carro("FERRARI", Motor(22,22))))
    println(pessoa1.moverVeiculoPara("FERRARI",2,5))
    println(pessoa1.veiculos[0].posicao.toString())
    println(pessoa1.venderVeiculo("FERRARI",Pessoa("NUNO", dataDeNascimento)))
    println(pessoa1.veiculos.toString())



}