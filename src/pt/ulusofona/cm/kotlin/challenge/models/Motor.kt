package pt.ulusofona.cm.kotlin.challenge.models;
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.*

class Motor(val cavalos: Int, val cilindrada: Int, var ligado: Boolean = false): Ligavel {

    override fun ligar() {
        this.ligado = true
    }

    override fun desligar() {
        if(this.ligado){
            this.ligado = false
        }else{
            throw VeiculoDesligadoException("Veiculo esta Desligado")
        }
    }

    override fun estaLigado(): Boolean {
        return this.ligado
    }

    override fun toString(): String {
        return "Motor | ${cavalos} | ${cilindrada}"
    }
}