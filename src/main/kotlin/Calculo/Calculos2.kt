package Calculo

import Forms.Form

class Calculos2 {
    fun calculateTotalArea(form: List<Form>): Double {
        var totalArea = 0.0

        for (forms in form) {
            totalArea += forms.calculateArea()
        }
        return totalArea
    }
}