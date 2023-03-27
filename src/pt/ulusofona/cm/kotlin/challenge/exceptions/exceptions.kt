package pt.ulusofona.cm.kotlin.challenge.exceptions
import pt.ulusofona.cm.kotlin.challenge.exceptions.*
import java.time.LocalDate
import src.pt.ulusofona.cm.kotlin.challenge.models.*
import src.pt.ulusofona.cm.kotlin.challenge.interfaces.*
class AlterarPosicaoException(message: String) : Exception(message)

class MenorDeIdadeException(message: String) : Exception(message)

class PessoaSemCartaException(message: String) : Exception(message)

class VeiculoNaoEncontradoException(message: String) : Exception(message)

class VeiculoDesligadoException(message: String) : Exception(message)

class VeiculoLigadoException(message: String) : Exception(message)