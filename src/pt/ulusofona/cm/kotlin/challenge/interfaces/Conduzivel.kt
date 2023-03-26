package pt.ulusofona.cm.kotlin.challenge.interfaces

interface Conduzivel {
    fun requerCarta(): Boolean
    fun podeSerConduzidoPor(idade: Int, carta: Boolean): Boolean
    fun conduzir()
    fun desligar()
    fun ligar()
    fun estaLigado(): Boolean
}