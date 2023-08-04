package Forms

import kotlin.math.PI
import kotlin.math.pow
class Circle(private val radius:Double): Form {
    override fun calculateArea(): Double {
       return PI*radius.pow(2)
    }
}