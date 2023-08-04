package Calculo

import Forms.Circle
import Forms.Rectangle

fun main() {
    println("Área do retângulo: ${Rectangle(3.0, 4.0).calculateArea()}")
    println("Área total: ${Circle(5.0).calculateArea()}")
    val formList = listOf(Circle(5.0), Rectangle(3.0, 4.0))
    val totalArea = calculos().calculateTotalArea(formList)
    println()
    println("Área total: %.2f".format(totalArea))

}