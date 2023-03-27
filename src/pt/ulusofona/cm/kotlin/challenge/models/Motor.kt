package pt.ulusofona.cm.kotlin.challenge.models;
import pt.ulusofona.cm.kotlin.challenge.interfaces.*

class Motor(val cavalos: Int, val cilindrada: Int, var ligado: Boolean = false): Ligavel {

    override fun ligar() {
        this.ligado = true
    }

    override fun desligar() {
        this.ligado = false
    }

    override fun estaLigado(): Boolean {
        return this.ligado
    }

    override fun toString(): String {
        return "Motor | ${cavalos} | ${cilindrada} | "
    }
}