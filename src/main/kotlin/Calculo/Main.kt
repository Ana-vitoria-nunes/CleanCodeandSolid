package Calculo

import Forms.Circle
import Forms.Rectangle

fun main() {
    while (true) {
        val inputUser=InputUser()
        println()
        println("1-Calcular área retângulo\n2-Calcular área circulo\n3-Sair")
        println()

        when(inputUser.lerInteiroDoUsuario("Qual opção deseja:")){
            1->{
                val base= inputUser.lerDecimalDoUsuario("Qual a base do retângulo:")
                val altura=inputUser.lerDecimalDoUsuario("Qual a altura do retângulo:")
                println( Rectangle(base,altura).calculateArea())
            }
            2->{
                val raio=inputUser.lerDecimalDoUsuario("Qual o raio do circulo:")
                println(Circle(raio).calculateArea())
            }
            3->{
                println("Saindo...")
                break
            }
            else-> println("Opção inválida!")
        }
    }
}
