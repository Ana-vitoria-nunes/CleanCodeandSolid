package Forms

class Rectangle(private val width:Double, private val heigth:Double): Form {
    override fun calculateArea(): Double {
        return width*heigth
    }
}
