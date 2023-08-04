package Calculo

import Forms.Circle
import Forms.Rectangle

fun main() {
    val formList = listOf(Circle(5.0), Rectangle(3.0, 4.0))
    val totalArea = calculos().calculateTotalArea(formList)
    println("Área do retângulo: %.2f".format(Rectangle(3.0, 4.0).calculateArea()))
    println("Área total: %.2f".format(Circle(5.0).calculateArea()))
    println()
    println("Área total: %.2f".format(totalArea))
}